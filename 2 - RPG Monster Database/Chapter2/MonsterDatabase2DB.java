public class MonsterDatabase2DB {
	private int next;
	private int size;
	private Monster2[] monsterData;

	public MonsterDatabase2DB() {
		next = 0;
		size = 4;
		monsterData = new Monster2[size];
	}

	public boolean insert(Monster2 newNode) {
		if (next >= this.monsterData.length) {
			Monster2[] newMonsterData = new Monster2[this.monsterData.length + 4];

			for (int i = 0; i < this.monsterData.length; i++) {
				newMonsterData[i] = this.monsterData[i];
			}

			this.monsterData = newMonsterData;
		}
		monsterData[next] = newNode.deepCopy();

		if (monsterData[next] == null)
			return false;
		next = next + 1;
		return true;
	}

	public Monster2 fetch(String targetKey) {
		Monster2 node;
		Monster2 temp;

		int i = 0;
		while (i < next && !(monsterData[i].compareTo(targetKey) == 0)) {
			i++;
		}
		if (i == next) {
			return null;
		}
		node = monsterData[i].deepCopy();
		if (i != 0) {
			temp = monsterData[i - 1];
			monsterData[i - 1] = monsterData[i];
			monsterData[i] = temp;
		}
		return node;
	}

	public boolean delete(String targetKey) {
		int i = 0;
		while (i < next && !(monsterData[i].compareTo(targetKey) == 0)) {
			i++;
		}
		if (i == next)
			return false;
		monsterData[i] = monsterData[next - 1];
		monsterData[next - 1] = null;
		next = next - 1;
		return true;
	}

	public boolean update(String targetKey, Monster2 newNode) {
		if (delete(targetKey) == false)
			return false;
		else if (insert(newNode) == false)
			return false;
		else
			return true;
	}

	public void printAll() {
		for (int i = 0; i < next; i++) {
			System.out.println(monsterData[i].toString());
		}
	}

}
