package Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Controller {
    public static abstract class Model{
        abstract String toJson();
    }

    public static class CatTreeModel extends Model{
        TreeSet<String> mCatTree = new TreeSet<String>();

        @Override
        String toJson() {
            return mCatTree.toString();
        }
    }

    public static class ItemsInCatModel extends Model{
        List<String> mItemsList = new ArrayList<String>();

        @Override
        String toJson() {
            return mItemsList.toString();
        }
    }

    String getAllCategories(){
        Model model = new CatTreeModel();
        return model.toJson();
    }
    String getAllItemsInCat(){
        List<Model> list = new ArrayList<>();
        list.add(new CatTreeModel());
        list.add(new ItemsInCatModel());
        return list.toString();
    }

}
