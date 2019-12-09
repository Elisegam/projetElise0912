package model;

public class Eleve {
		//Attributs
		private int id;
		private String name;
		private String surname;
		private String classe;

		//Constructor
		public Eleve(String name, String surname, String classe) {
			super();
			this.name = name;
			this.surname = surname;
			this.classe = classe;
		}
			
			//Getters and setters
		public int getId() {
			return id;
		}

	
		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getClasse() {
			return classe;
		}

		public void setClasse(String classe) {
			this.classe = classe;
		}

		@Override
		public String toString() {
			return "Eleve [name=" + name + ", surname=" + surname + ", classe=" + classe + "]";
		}
}