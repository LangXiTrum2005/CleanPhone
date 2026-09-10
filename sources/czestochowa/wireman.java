package czestochowa;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class wireman {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static int f25032beachfront = -1;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f25033attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f25034dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f25035marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f25036saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f25037wireman;

    public wireman() {
        int i = f25032beachfront;
        this.f25033attabal = i;
        this.f25036saneness = i;
        this.f25034dern = null;
    }

    public float apical(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public abstract void attabal(HashMap<String, coi.wireman> map);

    public boolean beachfront(String str) {
        String str2 = this.f25034dern;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void competently(int i) {
        this.f25033attabal = i;
    }

    public boolean cutely(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public wireman dern(wireman wiremanVar) {
        this.f25033attabal = wiremanVar.f25033attabal;
        this.f25036saneness = wiremanVar.f25036saneness;
        this.f25034dern = wiremanVar.f25034dern;
        this.f25037wireman = wiremanVar.f25037wireman;
        this.f25035marial = wiremanVar.f25035marial;
        return this;
    }

    public int formularize(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public abstract void marial(Context context, AttributeSet attributeSet);

    @Override // 
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public abstract wireman clone();

    public wireman taiyuan(int i) {
        this.f25036saneness = i;
        return this;
    }

    public abstract void wireman(HashSet<String> hashSet);

    public void impromptu(HashMap<String, Integer> map) {
    }
}
