
package lt.vtvpmc.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.entities.Fakturos;

public class FakturList {
	
	 @PersistenceContext
	    private EntityManager entityManager;
	    
	    @Transactional(readOnly = true)
	    public List<Fakturos> getInvoiceList() {
	        Query q = entityManager.createQuery("select i from Invoice i");
	        return q.getResultList();
	    }
	    
	    @Transactional
	    public void removeInvoice(Fakturos invoice) {
	        entityManager.remove(entityManager.merge(invoice));
	    }

}
