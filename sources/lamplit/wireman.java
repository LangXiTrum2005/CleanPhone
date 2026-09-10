package lamplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: KeyPath.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final wireman f32593dern = new wireman("COMPOSITION");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<String> f32594attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public marial f32595saneness;

    public wireman(String... strArr) {
        this.f32594attabal = Arrays.asList(strArr);
    }

    public wireman attabal(String str) {
        wireman wiremanVar = new wireman(this);
        wiremanVar.f32594attabal.add(str);
        return wiremanVar;
    }

    public final boolean beachfront(String str) {
        return "__container".equals(str);
    }

    public boolean competently(String str, int i) {
        if (beachfront(str)) {
            return true;
        }
        if (i >= this.f32594attabal.size()) {
            return false;
        }
        return this.f32594attabal.get(i).equals(str) || this.f32594attabal.get(i).equals("**") || this.f32594attabal.get(i).equals("*");
    }

    public boolean dern(String str, int i) {
        if (i >= this.f32594attabal.size()) {
            return false;
        }
        boolean z = i == this.f32594attabal.size() - 1;
        String str2 = this.f32594attabal.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f32594attabal.size() + (-2) && saneness())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f32594attabal.get(i + 1).equals(str)) {
            return i == this.f32594attabal.size() + (-2) || (i == this.f32594attabal.size() + (-3) && saneness());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f32594attabal.size() - 1) {
            return false;
        }
        return this.f32594attabal.get(i2).equals(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wireman wiremanVar = (wireman) obj;
            if (!this.f32594attabal.equals(wiremanVar.f32594attabal)) {
                return false;
            }
            marial marialVar = this.f32595saneness;
            marial marialVar2 = wiremanVar.f32595saneness;
            if (marialVar != null) {
                return marialVar.equals(marialVar2);
            }
            if (marialVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f32594attabal.hashCode() * 31;
        marial marialVar = this.f32595saneness;
        return iHashCode + (marialVar != null ? marialVar.hashCode() : 0);
    }

    public boolean impromptu(String str, int i) {
        return "__container".equals(str) || i < this.f32594attabal.size() - 1 || this.f32594attabal.get(i).equals("**");
    }

    public int marial(String str, int i) {
        if (beachfront(str)) {
            return 0;
        }
        if (this.f32594attabal.get(i).equals("**")) {
            return (i != this.f32594attabal.size() - 1 && this.f32594attabal.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean saneness() {
        List<String> list = this.f32594attabal;
        return list.get(list.size() - 1).equals("**");
    }

    public wireman taiyuan(marial marialVar) {
        wireman wiremanVar = new wireman(this);
        wiremanVar.f32595saneness = marialVar;
        return wiremanVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f32594attabal);
        sb.append(",resolved=");
        sb.append(this.f32595saneness != null);
        sb.append('}');
        return sb.toString();
    }

    public marial wireman() {
        return this.f32595saneness;
    }

    public wireman(wireman wiremanVar) {
        this.f32594attabal = new ArrayList(wiremanVar.f32594attabal);
        this.f32595saneness = wiremanVar.f32595saneness;
    }
}
