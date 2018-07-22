public class WebAdapter implements IWebRequester
{
    public WebService service;

    public void connect(WebService webService)
    {
        service = webService;
    }

    @Override
    public int request(Object object) {
        JsonObject jsonObj = toJson(object);
        JsonObject response = service.request(jsonObj);
        if (response != null)
            return 200;
        return 500;
    }

    private JsonObject toJson(Object object)
    {
        return new JsonObject();
    }
}