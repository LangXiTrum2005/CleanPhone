package androidx.transition;

import android.view.View;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class TransitionValues {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f8446b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8445a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8447c = new ArrayList();

    public TransitionValues(View view) {
        this.f8446b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.f8446b == transitionValues.f8446b && this.f8445a.equals(transitionValues.f8445a);
    }

    public final int hashCode() {
        return this.f8445a.hashCode() + (this.f8446b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbX = android.support.v4.media.a.x("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbX.append(this.f8446b);
        sbX.append(IOUtils.LINE_SEPARATOR_UNIX);
        String strM = android.support.v4.media.a.m(sbX.toString(), "    values:");
        HashMap map = this.f8445a;
        for (String str : map.keySet()) {
            strM = strM + "    " + str + ": " + map.get(str) + IOUtils.LINE_SEPARATOR_UNIX;
        }
        return strM;
    }
}
