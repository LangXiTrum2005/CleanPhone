package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.X3;
import java.util.Objects;

/* JADX INFO: compiled from: Person.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public CharSequence f9254attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f9255beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f9256dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f9257marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public IconCompat f9258saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String f9259wireman;

    /* JADX INFO: compiled from: Person.java */
    public static class attabal {
        public static dern attabal(Person person) {
            return new saneness().beachfront(person.getName()).dern(person.getIcon() != null ? IconCompat.createFromIcon(person.getIcon()) : null).competently(person.getUri()).marial(person.getKey()).saneness(person.isBot()).wireman(person.isImportant()).attabal();
        }

        public static Person saneness(dern dernVar) {
            return new Person.Builder().setName(dernVar.wireman()).setIcon(dernVar.saneness() != null ? dernVar.saneness().toIcon() : null).setUri(dernVar.marial()).setKey(dernVar.dern()).setBot(dernVar.beachfront()).setImportant(dernVar.competently()).build();
        }
    }

    /* JADX INFO: compiled from: Person.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public CharSequence f9260attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f9261beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f9262dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f9263marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public IconCompat f9264saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f9265wireman;

        public dern attabal() {
            return new dern(this);
        }

        public saneness beachfront(CharSequence charSequence) {
            this.f9260attabal = charSequence;
            return this;
        }

        public saneness competently(String str) {
            this.f9262dern = str;
            return this;
        }

        public saneness dern(IconCompat iconCompat) {
            this.f9264saneness = iconCompat;
            return this;
        }

        public saneness marial(String str) {
            this.f9265wireman = str;
            return this;
        }

        public saneness saneness(boolean z) {
            this.f9263marial = z;
            return this;
        }

        public saneness wireman(boolean z) {
            this.f9261beachfront = z;
            return this;
        }
    }

    public dern(saneness sanenessVar) {
        this.f9254attabal = sanenessVar.f9260attabal;
        this.f9258saneness = sanenessVar.f9264saneness;
        this.f9256dern = sanenessVar.f9262dern;
        this.f9259wireman = sanenessVar.f9265wireman;
        this.f9257marial = sanenessVar.f9263marial;
        this.f9255beachfront = sanenessVar.f9261beachfront;
    }

    public static dern attabal(Person person) {
        return attabal.attabal(person);
    }

    public boolean beachfront() {
        return this.f9257marial;
    }

    public boolean competently() {
        return this.f9255beachfront;
    }

    public Bundle cutely() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f9254attabal);
        IconCompat iconCompat = this.f9258saneness;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.f9256dern);
        bundle.putString(X3.i.W, this.f9259wireman);
        bundle.putBoolean("isBot", this.f9257marial);
        bundle.putBoolean("isImportant", this.f9255beachfront);
        return bundle;
    }

    public String dern() {
        return this.f9259wireman;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dern)) {
            return false;
        }
        dern dernVar = (dern) obj;
        String strDern = dern();
        String strDern2 = dernVar.dern();
        if (strDern == null && strDern2 == null) {
            return Objects.equals(Objects.toString(wireman()), Objects.toString(dernVar.wireman())) && Objects.equals(marial(), dernVar.marial()) && Boolean.valueOf(beachfront()).equals(Boolean.valueOf(dernVar.beachfront())) && Boolean.valueOf(competently()).equals(Boolean.valueOf(dernVar.competently()));
        }
        return Objects.equals(strDern, strDern2);
    }

    public int hashCode() {
        String strDern = dern();
        return strDern != null ? strDern.hashCode() : Objects.hash(wireman(), marial(), Boolean.valueOf(beachfront()), Boolean.valueOf(competently()));
    }

    public String impromptu() {
        String str = this.f9256dern;
        if (str != null) {
            return str;
        }
        if (this.f9254attabal == null) {
            return "";
        }
        return "name:" + ((Object) this.f9254attabal);
    }

    public String marial() {
        return this.f9256dern;
    }

    public IconCompat saneness() {
        return this.f9258saneness;
    }

    public Person taiyuan() {
        return attabal.saneness(this);
    }

    public CharSequence wireman() {
        return this.f9254attabal;
    }
}
