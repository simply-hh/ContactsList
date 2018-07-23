package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvItem;
    ArrayList<ContactItem> alContact;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItem = findViewById(R.id.listViewContacts);
        alContact = new ArrayList<>();
        ContactItem item1 = new ContactItem("Mary", "+65", 65442334);
        ContactItem item2 = new ContactItem("Ken", "+65", 97442437);
        alContact.add(item1);
        alContact.add(item2);
        caContact = new CustomAdapter(this, R.layout.contact_items, alContact);
        lvItem.setAdapter(caContact);
    }
}
