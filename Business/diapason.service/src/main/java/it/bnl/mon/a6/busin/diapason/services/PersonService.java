/*
 * <code>PersonService</code> che è automaticamente esposto dal JRF e utilizza il Repository
 */
/*
package it.bnl.mon.a6.busin.diapason.services;

import java.util.List;
import it.bnl.fwk.common.lognext.NxtLoggerFactory;
import it.bnl.fwk.common.lognext.logger.INxtLogger;
import it.bnl.fwk.jrfcore.core.annotation.JRFCoreRestAutoExpose;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import it.bnl.mon.a6.busin.diapason.dao.Person;
import it.bnl.mon.a6.busin.diapason.repositories.PersonRepository;

@Service
@JRFCoreRestAutoExpose
public class PersonService {
	private final static INxtLogger logger = NxtLoggerFactory.getLogger(PersonService.class.getName());

	@Autowired
	private PersonRepository repository;
		
	public List<Person> getByPesel(String pesel) {
		return repository.findByPesel(pesel);
	}
	
	public Person getById(Integer id) {
		return repository.findOne(id);
	}
	
	public List<Person> getAll() {
		return (List<Person>) repository.findAll();
	}
}
*/
