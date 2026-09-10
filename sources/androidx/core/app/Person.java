package androidx.core.app;

import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Person {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f4233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f4234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4235c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4236e;
    public boolean f;

    public static class Api22Impl {
        public static Person a(PersistableBundle persistableBundle) {
            Builder builder = new Builder();
            builder.f4237a = persistableBundle.getString("name");
            builder.f4239c = persistableBundle.getString("uri");
            builder.d = persistableBundle.getString("key");
            builder.f4240e = persistableBundle.getBoolean("isBot");
            builder.f = persistableBundle.getBoolean("isImportant");
            return builder.a();
        }

        public static PersistableBundle b(Person person) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.f4233a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", person.f4235c);
            persistableBundle.putString("key", person.d);
            persistableBundle.putBoolean("isBot", person.f4236e);
            persistableBundle.putBoolean("isImportant", person.f);
            return persistableBundle;
        }
    }

    public static class Api28Impl {
        public static Person a(android.app.Person person) {
            Builder builder = new Builder();
            builder.f4237a = person.getName();
            builder.f4238b = person.getIcon() != null ? IconCompat.b(person.getIcon()) : null;
            builder.f4239c = person.getUri();
            builder.d = person.getKey();
            builder.f4240e = person.isBot();
            builder.f = person.isImportant();
            return builder.a();
        }

        public static android.app.Person b(Person person) {
            android.app.Person.Builder name = new android.app.Person.Builder().setName(person.f4233a);
            IconCompat iconCompat = person.f4234b;
            return name.setIcon(iconCompat != null ? iconCompat.i() : null).setUri(person.f4235c).setKey(person.d).setBot(person.f4236e).setImportant(person.f).build();
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f4237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f4238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4239c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4240e;
        public boolean f;

        public final Person a() {
            Person person = new Person();
            person.f4233a = this.f4237a;
            person.f4234b = this.f4238b;
            person.f4235c = this.f4239c;
            person.d = this.d;
            person.f4236e = this.f4240e;
            person.f = this.f;
            return person;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String str = this.d;
        String str2 = person.d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.f4233a), Objects.toString(person.f4233a)) && Objects.equals(this.f4235c, person.f4235c) && Boolean.valueOf(this.f4236e).equals(Boolean.valueOf(person.f4236e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(person.f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f4233a, this.f4235c, Boolean.valueOf(this.f4236e), Boolean.valueOf(this.f));
    }
}
