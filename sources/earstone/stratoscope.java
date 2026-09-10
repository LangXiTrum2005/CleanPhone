package earstone;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: TransitionValues.java */
/* JADX INFO: loaded from: classes.dex */
public class stratoscope {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, Object> f25561attabal = new HashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ArrayList<Transition> f25562dern = new ArrayList<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public View f25563saneness;

    @Deprecated
    public stratoscope() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof stratoscope)) {
            return false;
        }
        stratoscope stratoscopeVar = (stratoscope) obj;
        return this.f25563saneness == stratoscopeVar.f25563saneness && this.f25561attabal.equals(stratoscopeVar.f25561attabal);
    }

    public int hashCode() {
        return (this.f25563saneness.hashCode() * 31) + this.f25561attabal.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f25563saneness + "\n") + "    values:";
        for (String str2 : this.f25561attabal.keySet()) {
            str = str + "    " + str2 + ": " + this.f25561attabal.get(str2) + "\n";
        }
        return str;
    }

    public stratoscope(View view) {
        this.f25563saneness = view;
    }
}
