package Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ adminLoginValidateTestUnit.class, deleteaccountTestUnit.class, DisplayDetailsTestUnit.class,
		easyquestionssizeTestUnit.class, getdetailsbyidTestUnit.class, geteasyquestiondescriptionTestUnit.class,
		geteasyquestionsTestUnit.class, getfacultyNameTestUnit.class, getgeneratedpapersbyfacultyidTestUnit.class,
		getgeneratedpaperspaperidTestUnit.class, gethardquestiondescriptionTestUnit.class,
		gethardquestionsTestUnit.class, getmediumquestiondescriptionTestUnit.class, getmediumquestionsTestUnit.class,
		getquestionslistTestUnit.class, hardquestionssizeTestUnit.class, insertsemesterTestUnit.class,insertbranchTestUnit.class,
		insertcourseTestUnit.class, inserteasyquestionTestUnit.class, inserthardquestionTestUnit.class,
		insertmediumquestionTestUnit.class, LogInValidateTestUnit.class,
		mediumquestionssizeTestUnit.class, SignUpTestUnit.class, updatedetailsTestUnit.class })
public class AllTests {

}
