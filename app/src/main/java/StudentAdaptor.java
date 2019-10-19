import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class StudentAdaptor {
    private LayoutInflater minFlater;
    private List<Student> mData=new ArrayList<>();

    public StudentAdaptor(Context context){
        this.minFlater=LayoutInflater.from(context);
        this.mData.addAll(StudentRepo.getInstance().getStudent();
    }

}
