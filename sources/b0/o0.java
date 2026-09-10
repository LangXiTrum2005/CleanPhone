package b0;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.X3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f5160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f5161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5165f;

    public static o0 a(Person person) {
        IconCompat iconCompatE;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.f4014k;
            iconCompatE = go.c.e(icon);
        } else {
            iconCompatE = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        o0 o0Var = new o0();
        o0Var.f5160a = name;
        o0Var.f5161b = iconCompatE;
        o0Var.f5162c = uri;
        o0Var.f5163d = key;
        o0Var.f5164e = zIsBot;
        o0Var.f5165f = zIsImportant;
        return o0Var;
    }

    public static o0 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString(X3.i.W);
        boolean z10 = bundle.getBoolean("isBot");
        boolean z11 = bundle.getBoolean("isImportant");
        o0 o0Var = new o0();
        o0Var.f5160a = charSequence;
        o0Var.f5161b = iconCompatA;
        o0Var.f5162c = string;
        o0Var.f5163d = string2;
        o0Var.f5164e = z10;
        o0Var.f5165f = z11;
        return o0Var;
    }

    public final Person c() {
        Person.Builder name = new Person.Builder().setName(this.f5160a);
        IconCompat iconCompat = this.f5161b;
        return name.setIcon(iconCompat != null ? iconCompat.g() : null).setUri(this.f5162c).setKey(this.f5163d).setBot(this.f5164e).setImportant(this.f5165f).build();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        String str = this.f5163d;
        String str2 = o0Var.f5163d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.f5160a), Objects.toString(o0Var.f5160a)) && Objects.equals(this.f5162c, o0Var.f5162c) && Boolean.valueOf(this.f5164e).equals(Boolean.valueOf(o0Var.f5164e)) && Boolean.valueOf(this.f5165f).equals(Boolean.valueOf(o0Var.f5165f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f5163d;
        return str != null ? str.hashCode() : Objects.hash(this.f5160a, this.f5162c, Boolean.valueOf(this.f5164e), Boolean.valueOf(this.f5165f));
    }
}
