package com.ObjectDesignProject;

public class Components extends Computer{

	
		public int displays = 0;
		public int ram = 0;
		public int cores = 0;
		public int gpus = 0;
		public int starageSpace = 0;
		public int programs = 0;
		public float budget = 0.00f;
		public String operatingSystem = null;
		public String primaryUse = null;
		public String recipiant = null;
		public String addComments = null;
		
		

		
		
		public Components(int displays, int ram, int cores, int gpus, int starageSpace, int programs, float budget,
				String operatingSystem, String primaryUse, String recipiant, String addComments) {
			super();
			this.displays = displays;
			this.ram = ram;
			this.cores = cores;
			this.gpus = gpus;
			this.starageSpace = starageSpace;
			this.programs = programs;
			this.budget = budget;
			this.operatingSystem = operatingSystem;
			this.primaryUse = primaryUse;
			this.recipiant = recipiant;
			this.addComments = addComments;
			
			
		}


		public Components() {
			// TODO Auto-generated constructor stub
		}


		public int getDisplays() {
			return displays;
		}


		public void setDisplays(int displays) {
			this.displays = displays;
		}


		public int getRam() {
			return ram;
		}


		public void setRam(int ram) {
			this.ram = ram;
		}


		public int getCores() {
			return cores;
		}


		public void setCores(int cores) {
			this.cores = cores;
		}


		public int getGpus() {
			return gpus;
		}


		public void setGpus(int gpus) {
			this.gpus = gpus;
		}


		public int getStarageSpace() {
			return starageSpace;
		}


		public void setStarageSpace(int starageSpace) {
			this.starageSpace = starageSpace;
		}


		public int getPrograms() {
			return programs;
		}


		public void setPrograms(int programs) {
			this.programs = programs;
		}


		public float getBudget() {
			return budget;
		}


		public void setBudget(float budget) {
			this.budget = budget;
		}


		public String getOperatingSystem() {
			return operatingSystem;
		}


		public void setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
		}


		public String getPrimaryUse() {
			return primaryUse;
		}


		public void setPrimaryUse(String primaryUse) {
			this.primaryUse = primaryUse;
		}
		
		public String getRecipiant() {
			return recipiant;
		}


		public void setRecipiant(String recipiant) {
			this.recipiant = recipiant;
		}
		
		public String getAddComments() {
			return addComments;
		}


		public void setAddComments(String addComments) {
			this.addComments = addComments;
		}

		
		
		


		@Override
		public void starts() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void runs() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void connects() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void installs() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void uninstalls() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void updates() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void displays() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public String toString() {
			return "The components yoddu have requested for your new computer are: Number of displays: " + displays + ", ram(GB)= " + ram + ", cores: " + cores + ", Graphics Cards: " + gpus
					+ ", starageSpace(GB): " + starageSpace + ", Number of programs: " + programs + ", Your budget: " + budget
					+ ", Requested operating system: " + operatingSystem + ", Computer's primary use: " + primaryUse + ", Recipiant: " + recipiant
					+ ", Additional comments: " + addComments;
		}
		
		
		
		
		
		
}
