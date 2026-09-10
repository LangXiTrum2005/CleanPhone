package ads_mobile_sdk;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class wk0 {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ArrayList a = new ArrayList();

    public final void a(View view, vk0 vk0Var, String str) {
        uk0 uk0Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.a.iterator();
        do {
            if (!it.hasNext()) {
                uk0Var = null;
                break;
            }
            uk0Var = (uk0) it.next();
        } while (uk0Var.a.get() != view);
        if (uk0Var == null) {
            this.a.add(new uk0(view, vk0Var, str));
        }
    }
}
