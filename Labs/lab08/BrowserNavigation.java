import java.util.Stack;

public class BrowserNavigation {
    private Stack<String> currentPageStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserNavigation() {
        currentPageStack = new Stack<>();
        forwardStack = new Stack<>();
    }

    
    public void visit(String url) {
        currentPageStack.push(url);
        currentPage = url;
        forwardStack.clear(); 
    }

    
    public String back() {
        if (currentPageStack.size() <= 1) {
            return "No previous page";
        }
        forwardStack.push(currentPage);   
        currentPageStack.pop();           
        currentPage = currentPageStack.peek(); 
        return currentPage;
    }

    
    public String forward() {
        if (forwardStack.isEmpty()) {
            return "No forward pages";
        }
        currentPage = forwardStack.pop();
        return currentPage;
    }


    public String getCurrentPage() {
        return currentPage;
    }

    public static void main(String[] args) {
        BrowserNavigation browser = new BrowserNavigation();

        browser.visit("google.com");
        browser.visit("stackoverflow.com");
        browser.visit("github.com");

        System.out.println("Current Page: " + browser.getCurrentPage()); 

        System.out.println("Back: " + browser.back()); 
        System.out.println("Back: " + browser.back()); 

        System.out.println("Forward: " + browser.forward()); 
        System.out.println("Visit new page");
        browser.visit("oracle.com");
        System.out.println("Current Page: " + browser.getCurrentPage()); 

        System.out.println("Forward: " + browser.forward()); 
        System.out.println("Back: " + browser.back()); 
    }
}
