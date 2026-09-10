package b0;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5081e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5082f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0 f5083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f5084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f5085i;

    public b0() {
    }

    @Override // b0.g0
    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.f5083g.f5160a);
        o0 o0Var = this.f5083g;
        o0Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", o0Var.f5160a);
        IconCompat iconCompat = o0Var.f5161b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.f4015a) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.f4016b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.f4016b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.f4016b);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.f4016b);
                    break;
            }
            bundle2.putInt("type", iconCompat.f4015a);
            bundle2.putInt("int1", iconCompat.f4019e);
            bundle2.putInt("int2", iconCompat.f4020f);
            bundle2.putString("string1", iconCompat.f4024j);
            ColorStateList colorStateList = iconCompat.f4021g;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4022h;
            if (mode != IconCompat.f4014k) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", o0Var.f5162c);
        bundle3.putString(X3.i.W, o0Var.f5163d);
        bundle3.putBoolean("isBot", o0Var.f5164e);
        bundle3.putBoolean("isImportant", o0Var.f5165f);
        bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, bundle3);
        bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.f5084h);
        if (this.f5084h != null && this.f5085i.booleanValue()) {
            bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.f5084h);
        }
        ArrayList arrayList = this.f5081e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, a0.a(arrayList));
        }
        ArrayList arrayList2 = this.f5082f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, a0.a(arrayList2));
        }
        Boolean bool = this.f5085i;
        if (bool != null) {
            bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
        }
    }

    @Override // b0.g0
    public final void b(h9.k kVar) {
        this.f5085i = Boolean.valueOf(f());
        Notification.MessagingStyle messagingStyleA = x.a(this.f5083g.c());
        Iterator it = this.f5081e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a0 a0Var = (a0) it.next();
            o0 o0Var = a0Var.f5076c;
            Notification.MessagingStyle.Message messageB = z.b(a0Var.f5074a, a0Var.f5075b, o0Var != null ? o0Var.c() : null);
            String str = a0Var.f5078e;
            if (str != null) {
                y.a(messageB, str, a0Var.f5079f);
            }
            v.a(messagingStyleA, messageB);
        }
        for (a0 a0Var2 : this.f5082f) {
            o0 o0Var2 = a0Var2.f5076c;
            Notification.MessagingStyle.Message messageB2 = z.b(a0Var2.f5074a, a0Var2.f5075b, o0Var2 == null ? null : o0Var2.c());
            String str2 = a0Var2.f5078e;
            if (str2 != null) {
                y.a(messageB2, str2, a0Var2.f5079f);
            }
            w.a(messagingStyleA, messageB2);
        }
        this.f5085i.getClass();
        v.b(messagingStyleA, this.f5084h);
        x.b(messagingStyleA, this.f5085i.booleanValue());
        messagingStyleA.setBuilder((Notification.Builder) kVar.f42287b);
    }

    @Override // b0.g0
    public final String d() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // b0.g0
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList arrayList = this.f5081e;
        arrayList.clear();
        if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
            this.f5083g = o0.b(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
        } else {
            String string = bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            o0 o0Var = new o0();
            o0Var.f5160a = string;
            o0Var.f5161b = null;
            o0Var.f5162c = null;
            o0Var.f5163d = null;
            o0Var.f5164e = false;
            o0Var.f5165f = false;
            this.f5083g = o0Var;
        }
        CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
        this.f5084h = charSequence;
        if (charSequence == null) {
            this.f5084h = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
        if (parcelableArray != null) {
            arrayList.addAll(a0.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
        if (parcelableArray2 != null) {
            this.f5082f.addAll(a0.b(parcelableArray2));
        }
        if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
            this.f5085i = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
        }
    }

    public final boolean f() {
        p pVar = this.f5121a;
        if (pVar != null && pVar.f5166a.getApplicationInfo().targetSdkVersion < 28 && this.f5085i == null) {
            return this.f5084h != null;
        }
        Boolean bool = this.f5085i;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public b0(o0 o0Var) {
        if (!TextUtils.isEmpty(o0Var.f5160a)) {
            this.f5083g = o0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
