package et.telebof.requests;

public class SetMyDescription extends AbstractBaseRequest<SetMyDescription, Boolean>{

    public SetMyDescription(String description, String languageCode, RequestSender requestSender){
        super(requestSender, "setMyDescription");
        add("description", description);
        add("language_code", languageCode);
    }

    @Override
    public Boolean exec() {
        Object response = requestSender.makeRequest(this);
        return (Boolean) response;
    }

}
