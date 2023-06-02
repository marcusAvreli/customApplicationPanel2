package customApplicationPanel2.components.completer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import customApplicationPanel2.entity.CustomApplication;
import customApplicationPanel2.generic.DropDownBoxColumnDefinition;
import customApplicationPanel2.reflection.RMT2ReflectionUtil;

/**
 *
 * @author Noman
 */
/**
 *
 * Implementation of the Searchable interface that searches a List of String
 * objects. * This implementation searches only the beginning of the words, and
 * is not be optimized
 *
 * for very large Lists.
 *
 *
 * @author G. Cope
 * @param <T>
 *
 *
 *
 */
public class StringSearchable<T> implements Searchable<T, String> {
	private static final Logger logger = LoggerFactory.getLogger(StringSearchable.class);
	 private Class<?> type;
	 private DropDownBoxColumnDefinition colDef;
    public DropDownBoxColumnDefinition getColDef() {
		return colDef;
	}

	public void setColDef(DropDownBoxColumnDefinition colDef) {
		this.colDef = colDef;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	private List<T> terms = new ArrayList<T>();

    /**
     *
     * Constructs a new object based upon the parameter terms.
     *
     *
     * @param terms The inventory of terms to search.
     *
     */
    public StringSearchable(List<T> terms) {

        this.terms.addAll(terms);

    }

    public List<T> getTerms() {
		return terms;
	}

	public void setTerms(List<T> terms) {
		this.terms = terms;
	}

	@Override
    public Collection<T> search(String name) {
        List<T> founds = new ArrayList<T>();
      logger.info("key: "+name);
          
        for (T m : terms) {
        	
        	
        	String displayName = (String) RMT2ReflectionUtil.getFieldValue(m, colDef.getDisplayValue());
        	
        	String inName = (String) RMT2ReflectionUtil.getFieldValue(m, colDef.getId());
            if (inName.contains(name) || displayName.contains(name)) {
                founds.add(m);
               logger.info("found: "+name);
            }
        }

        return founds;

    }
}