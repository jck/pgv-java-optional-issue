// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: example.proto

package examplepb;


@SuppressWarnings("all")
public class ExampleValidator {
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		
		if (clazz.equals(examplepb.Example.Person.class)) return new PersonValidator();
		return null;
	}


/**
	 * Validates {@code Person} protobuf objects.
	 */
	public static class PersonValidator implements io.envoyproxy.pgv.ValidatorImpl<examplepb.Example.Person> {
		
		private final Long ID__GT = 999L;
	
		
		private final Long REQUIRED_INT_64__LTE = 10000L;
		private final Long REQUIRED_INT_64__GTE = 0L;
	
	

	public void assertValid(examplepb.Example.Person proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.ComparativeValidation.greaterThan(".examplepb.Person.id", proto.getId(), ID__GT, java.util.Comparator.naturalOrder());
	
			io.envoyproxy.pgv.ComparativeValidation.range(".examplepb.Person.required_int64", proto.getRequiredInt64(), null, REQUIRED_INT_64__LTE, null, REQUIRED_INT_64__GTE, java.util.Comparator.naturalOrder());
	
	}
}
}

