package eu.europa.ec.digit.contentmanagement.domain.jpa.access;

/**
 * 
 * @author bentsth
 */
public class DaoModuleJpaTestImpl extends DaoModuleJpaImpl {
             

    @Override
    public void initSub() throws Exception {
        super.initSub();
        generateTestData();
    }

}
