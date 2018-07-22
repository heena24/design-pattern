public class WebClient
{
    private IWebRequester webRequester;

    public void initializeWebRequester(IWebRequester requester)
    {
        webRequester = requester;
    }

    public void doWork()
    {
        Object obj = makeObject();
        int status = webRequester.request(obj);

        if (status == 200)
        {
            System.out.println("OK");
        } else
        {
            System.out.println("Not OK");
        }
    }

    private Object makeObject()
    {
        return new Object();
    }
}