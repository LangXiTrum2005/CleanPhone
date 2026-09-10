package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o0 f5200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f5201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f5202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PendingIntent f5203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f5205k;
    public Integer l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IconCompat f5206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f5207n;

    @Override // b0.g0
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.f5199e);
        bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.f5204j);
        o0 o0Var = this.f5200f;
        if (o0Var != null) {
            bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, q.b(o0Var.c()));
        }
        IconCompat iconCompat = this.f5206m;
        if (iconCompat != null) {
            Context context = this.f5121a.f5166a;
            bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, iconCompat.g());
        }
        bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.f5207n);
        bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.f5201g);
        bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.f5202h);
        bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.f5203i);
        Integer num = this.f5205k;
        if (num != null) {
            bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
        }
        Integer num2 = this.l;
        if (num2 != null) {
            bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
        }
    }

    @Override // b0.g0
    public final void b(h9.k kVar) {
        Notification.Builder builder = (Notification.Builder) kVar.f42287b;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (Build.VERSION.SDK_INT < 31) {
            o0 o0Var = this.f5200f;
            builder.setContentTitle(o0Var != null ? o0Var.f5160a : null);
            Bundle bundle = this.f5121a.f5189y;
            CharSequence charSequence = (bundle == null || !bundle.containsKey(NotificationCompat.EXTRA_TEXT)) ? null : this.f5121a.f5189y.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (charSequence == null) {
                int i10 = this.f5199e;
                if (i10 == 1) {
                    string = this.f5121a.f5166a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i10 == 2) {
                    string = this.f5121a.f5166a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i10 == 3) {
                    string = this.f5121a.f5166a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            o0 o0Var2 = this.f5200f;
            if (o0Var2 != null) {
                IconCompat iconCompat = o0Var2.f5161b;
                if (iconCompat != null) {
                    Context context = this.f5121a.f5166a;
                    builder.setLargeIcon(iconCompat.g());
                }
                q.a(builder, this.f5200f.c());
            }
            builder.setCategory(NotificationCompat.CATEGORY_CALL);
            return;
        }
        int i11 = this.f5199e;
        if (i11 == 1) {
            callStyleA = r.a(this.f5200f.c(), this.f5202h, this.f5201g);
        } else if (i11 == 2) {
            callStyleA = r.b(this.f5200f.c(), this.f5203i);
        } else if (i11 == 3) {
            callStyleA = r.c(this.f5200f.c(), this.f5203i, this.f5201g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f5199e));
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            Integer num = this.f5205k;
            if (num != null) {
                r.d(callStyleA, num.intValue());
            }
            Integer num2 = this.l;
            if (num2 != null) {
                r.e(callStyleA, num2.intValue());
            }
            r.h(callStyleA, this.f5207n);
            IconCompat iconCompat2 = this.f5206m;
            if (iconCompat2 != null) {
                Context context2 = this.f5121a.f5166a;
                r.g(callStyleA, iconCompat2.g());
            }
            r.f(callStyleA, this.f5204j);
        }
    }

    @Override // b0.g0
    public final String d() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // b0.g0
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f5199e = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
        this.f5204j = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
        if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
            this.f5200f = o0.a((Person) bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON));
        } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
            this.f5200f = o0.b(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
        }
        if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
            Icon icon = (Icon) bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON);
            PorterDuff.Mode mode = IconCompat.f4014k;
            this.f5206m = go.c.e(icon);
        } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
            this.f5206m = IconCompat.a(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
        }
        this.f5207n = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
        this.f5201g = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
        this.f5202h = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
        this.f5203i = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
        this.f5205k = bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
        this.l = bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR)) : null;
    }

    public final g f(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.f5121a.f5166a.getColor(i12));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f5121a.f5166a.getResources().getString(i11));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        g gVarA = new f(IconCompat.c(this.f5121a.f5166a, i10), spannableStringBuilder, pendingIntent).a();
        gVarA.f5110a.putBoolean("key_action_priority", true);
        return gVarA;
    }
}
