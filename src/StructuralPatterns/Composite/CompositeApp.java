package StructuralPatterns.Composite;

public class CompositeApp {
    public static void main(String[] args) {
        HTMLLeafElement paragraph1 = new HTMLLeafElement();
        paragraph1.setType("p");
        paragraph1.setText("Paragraph 1");

        HTMLLeafElement paragraph2 = new HTMLLeafElement();
        paragraph2.setType("p");
        paragraph2.setText("Paragraph 2");

        HTMLLeafElement paragraph3 = new HTMLLeafElement();
        paragraph3.setType("p");
        paragraph3.setText("Paragraph 3");

        HTMLCompositeElement div1 = new HTMLCompositeElement();
        div1.addElement(paragraph1);
        div1.addElement(paragraph2);
        div1.addElement(paragraph3);

        HTMLCompositeElement page = new HTMLCompositeElement();
        page.addElement(div1);

//        System.out.println(page.iterator());
        page.iterator();
    }
}
