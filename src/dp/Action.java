package dp;

import dp.control.services.action.Action;

class XmlAction extends Action<String> {
    public String command;
    public String title;
    public String description;
    public String color;
    public String iconPath;


    public XmlAction(String command) {
        super(command);
    }
}
