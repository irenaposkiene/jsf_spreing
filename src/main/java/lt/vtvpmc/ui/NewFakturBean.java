
package lt.vtvpmc.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;


import lt.vtvpmc.entities.Fakturos;


public class NewFakturBean {
	
	 @PersistenceContext
	    private EntityManager entityManager;
	 
	    
	    
	 	private String fakturosNumber;
		private String fakturosDate;
		private String fakturosCompany;
		private String fakturosClient;
		
	    @Transactional
	    public String save() {
	        Fakturos invoice = new Fakturos(fakturosNumber,fakturosClient,fakturosCompany);
	        entityManager.persist(invoice);
	        return "fakt_main";
	        
	        
	    }

		public EntityManager getEntityManager() {
			return entityManager;
		}

		public void setEntityManager(EntityManager entityManager) {
			this.entityManager = entityManager;
		}

		public String getFakturosNumber() {
			return fakturosNumber;
		}

		public void setFakturosNumber(String fakturosNumber) {
			this.fakturosNumber = fakturosNumber;
		}

		public String getFakturosDate() {
			return fakturosDate;
		}

		public void setFakturosDate(String fakturosDate) {
			this.fakturosDate = fakturosDate;
		}

		public String getFakturosCompany() {
			return fakturosCompany;
		}

		public void setFakturosCompany(String fakturosCompany) {
			this.fakturosCompany = fakturosCompany;
		}

		public String getFakturosClient() {
			return fakturosClient;
		}

		public void setFakturosClient(String fakturosClient) {
			this.fakturosClient = fakturosClient;
		}
		
		
		
}

	