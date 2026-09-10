package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.storage.androidcleaner.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public String B;
    public String C;
    public long D;
    public final boolean F;
    public final Notification G;
    public boolean H;
    public final ArrayList I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5166a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f5170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f5171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f5172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f5173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f5174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5176k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g0 f5178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f5179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f5183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5184t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f5188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f5189y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5167b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5168c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5169d = new ArrayList();
    public boolean l = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5185u = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5190z = 0;
    public int A = 0;
    public int E = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.G = notification;
        this.f5166a = context;
        this.B = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f5176k = 0;
        this.I = new ArrayList();
        this.F = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle extras;
        Bundle[] bundleArr;
        g gVarF;
        int i10;
        h9.k kVar = new h9.k();
        kVar.f42289d = new Bundle();
        kVar.f42288c = this;
        Notification.Builder builder = new Notification.Builder(this.f5166a, this.B);
        kVar.f42287b = builder;
        Notification notification = this.G;
        Bundle[] bundleArr2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f5170e).setContentText(this.f5171f).setContentInfo(null).setContentIntent(this.f5172g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(this.f5173h, (notification.flags & 128) != 0).setNumber(this.f5175j).setProgress(this.f5180p, this.f5181q, this.f5182r);
        IconCompat iconCompat = this.f5174i;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.g());
        builder.setSubText(this.f5179o).setUsesChronometer(this.f5177m).setPriority(this.f5176k);
        g0 g0Var = this.f5178n;
        if (g0Var instanceof s) {
            s sVar = (s) g0Var;
            PendingIntent pendingIntent = sVar.f5202h;
            g gVarF2 = pendingIntent == null ? sVar.f(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, sVar.l, R.color.call_notification_decline_color, sVar.f5203i) : sVar.f(R.drawable.ic_call_decline, R.string.call_notification_decline_action, sVar.l, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = sVar.f5201g;
            if (pendingIntent2 == null) {
                gVarF = null;
            } else {
                boolean z10 = sVar.f5204j;
                gVarF = sVar.f(z10 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z10 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, sVar.f5205k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(gVarF2);
            ArrayList<g> arrayList2 = sVar.f5121a.f5167b;
            if (arrayList2 != null) {
                i10 = 2;
                for (g gVar : arrayList2) {
                    if (gVar.f5116g) {
                        arrayList.add(gVar);
                    } else if (!gVar.f5110a.getBoolean("key_action_priority")) {
                        arrayList.add(gVar);
                        i10--;
                    }
                    if (gVarF != null && i10 == 1) {
                        arrayList.add(gVarF);
                        i10--;
                    }
                }
            } else {
                i10 = 2;
            }
            if (gVarF != null && i10 >= 1) {
                arrayList.add(gVarF);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kVar.a((g) it.next());
            }
        } else {
            Iterator it2 = this.f5167b.iterator();
            while (it2.hasNext()) {
                kVar.a((g) it2.next());
            }
        }
        Bundle bundle = this.f5189y;
        if (bundle != null) {
            ((Bundle) kVar.f42289d).putAll(bundle);
        }
        ((Notification.Builder) kVar.f42287b).setShowWhen(this.l);
        ((Notification.Builder) kVar.f42287b).setLocalOnly(this.f5185u);
        ((Notification.Builder) kVar.f42287b).setGroup(this.f5183s);
        ((Notification.Builder) kVar.f42287b).setSortKey(null);
        ((Notification.Builder) kVar.f42287b).setGroupSummary(this.f5184t);
        kVar.f42286a = this.E;
        ((Notification.Builder) kVar.f42287b).setCategory(this.f5188x);
        ((Notification.Builder) kVar.f42287b).setColor(this.f5190z);
        ((Notification.Builder) kVar.f42287b).setVisibility(this.A);
        ((Notification.Builder) kVar.f42287b).setPublicVersion(null);
        ((Notification.Builder) kVar.f42287b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.I;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) kVar.f42287b).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = this.f5169d;
        if (arrayList4.size() > 0) {
            if (this.f5189y == null) {
                this.f5189y = new Bundle();
            }
            Bundle bundle2 = this.f5189y.getBundle("android.car.EXTENSIONS");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i11 = 0;
            while (i11 < arrayList4.size()) {
                String string = Integer.toString(i11);
                g gVar2 = (g) arrayList4.get(i11);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = gVar2.a();
                Bundle bundle6 = gVar2.f5110a;
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.e() : 0);
                bundle5.putCharSequence("title", gVar2.f5118i);
                bundle5.putParcelable("actionIntent", gVar2.f5119j);
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", gVar2.f5113d);
                bundle5.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle7);
                q0[] q0VarArr = gVar2.f5112c;
                if (q0VarArr == null) {
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[q0VarArr.length];
                    int i12 = 0;
                    while (i12 < q0VarArr.length) {
                        q0 q0Var = q0VarArr[i12];
                        int i13 = i12;
                        Bundle bundle8 = new Bundle();
                        q0[] q0VarArr2 = q0VarArr;
                        Bundle[] bundleArr3 = bundleArr;
                        bundle8.putString("resultKey", q0Var.f5192a);
                        bundle8.putCharSequence("label", q0Var.f5193b);
                        bundle8.putCharSequenceArray("choices", q0Var.f5194c);
                        bundle8.putBoolean("allowFreeFormInput", q0Var.f5195d);
                        bundle8.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, q0Var.f5197f);
                        Set set = q0Var.f5198g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList5 = new ArrayList<>(set.size());
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                arrayList5.add((String) it4.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList5);
                        }
                        bundleArr3[i13] = bundle8;
                        i12 = i13 + 1;
                        q0VarArr = q0VarArr2;
                        bundleArr = bundleArr3;
                    }
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", gVar2.f5114e);
                bundle5.putInt("semanticAction", gVar2.f5115f);
                bundle4.putBundle(string, bundle5);
                i11++;
                arrayList4 = arrayList4;
                bundleArr2 = null;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (this.f5189y == null) {
                this.f5189y = new Bundle();
            }
            this.f5189y.putBundle("android.car.EXTENSIONS", bundle2);
            ((Bundle) kVar.f42289d).putBundle("android.car.EXTENSIONS", bundle3);
        }
        ((Notification.Builder) kVar.f42287b).setExtras(this.f5189y);
        ((Notification.Builder) kVar.f42287b).setRemoteInputHistory(null);
        ((Notification.Builder) kVar.f42287b).setBadgeIconType(0);
        ((Notification.Builder) kVar.f42287b).setSettingsText(null);
        ((Notification.Builder) kVar.f42287b).setShortcutId(this.C);
        ((Notification.Builder) kVar.f42287b).setTimeoutAfter(this.D);
        ((Notification.Builder) kVar.f42287b).setGroupAlertBehavior(this.E);
        if (this.f5187w) {
            ((Notification.Builder) kVar.f42287b).setColorized(this.f5186v);
        }
        if (!TextUtils.isEmpty(this.B)) {
            ((Notification.Builder) kVar.f42287b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it5 = this.f5168c.iterator();
        while (it5.hasNext()) {
            ((Notification.Builder) kVar.f42287b).addPerson(((o0) it5.next()).c());
        }
        int i14 = Build.VERSION.SDK_INT;
        ((Notification.Builder) kVar.f42287b).setAllowSystemGeneratedContextualActions(this.F);
        ((Notification.Builder) kVar.f42287b).setBubbleMetadata(null);
        if (i14 >= 36) {
            i.b((Notification.Builder) kVar.f42287b);
        }
        if (this.H) {
            if (((p) kVar.f42288c).f5184t) {
                kVar.f42286a = 2;
            } else {
                kVar.f42286a = 1;
            }
            ((Notification.Builder) kVar.f42287b).setVibrate(null);
            ((Notification.Builder) kVar.f42287b).setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            ((Notification.Builder) kVar.f42287b).setDefaults(i15);
            if (TextUtils.isEmpty(((p) kVar.f42288c).f5183s)) {
                ((Notification.Builder) kVar.f42287b).setGroup(NotificationCompat.GROUP_KEY_SILENT);
            }
            ((Notification.Builder) kVar.f42287b).setGroupAlertBehavior(kVar.f42286a);
        }
        p pVar = (p) kVar.f42288c;
        g0 g0Var2 = pVar.f5178n;
        if (g0Var2 != null) {
            g0Var2.b(kVar);
        }
        Notification notificationBuild = ((Notification.Builder) kVar.f42287b).build();
        if (g0Var2 != null) {
            pVar.f5178n.getClass();
        }
        if (g0Var2 != null && (extras = NotificationCompat.getExtras(notificationBuild)) != null) {
            g0Var2.a(extras);
        }
        return notificationBuild;
    }

    public final void c(int i10, boolean z10) {
        Notification notification = this.G;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void d(Uri uri) {
        Notification notification = this.G;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void e(g0 g0Var) {
        if (this.f5178n != g0Var) {
            this.f5178n = g0Var;
            if (g0Var == null || g0Var.f5121a == this) {
                return;
            }
            g0Var.f5121a = this;
            e(g0Var);
        }
    }
}
