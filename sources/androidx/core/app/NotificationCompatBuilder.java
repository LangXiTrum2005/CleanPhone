package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f4221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationCompat.Builder f4222c;
    public final Bundle d;

    public static class Api20Impl {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i2, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z2) {
            return builder.setGroupSummary(z2);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z2) {
            return builder.setLocalOnly(z2);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class Api21Impl {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i2) {
            return builder.setColor(i2);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i2) {
            return builder.setVisibility(i2);
        }
    }

    public static class Api23Impl {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class Api24Impl {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAllowGeneratedReplies(z2);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class Api26Impl {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i2) {
            return builder.setBadgeIconType(i2);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z2) {
            return builder.setColorized(z2);
        }

        public static Notification.Builder d(Notification.Builder builder, int i2) {
            return builder.setGroupAlertBehavior(i2);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    public static class Api28Impl {
        public static Notification.Builder a(Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i2) {
            return builder.setSemanticAction(i2);
        }
    }

    public static class Api29Impl {
        public static Notification.Builder a(Notification.Builder builder, boolean z2) {
            return builder.setAllowSystemGeneratedContextualActions(z2);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z2) {
            return builder.setContextual(z2);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class Api31Impl {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAuthenticationRequired(z2);
        }

        public static Notification.Builder b(Notification.Builder builder, int i2) {
            return builder.setForegroundServiceBehavior(i2);
        }
    }

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        ArrayList<Person> arrayList;
        int i2;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        boolean z2 = true;
        new ArrayList();
        this.d = new Bundle();
        this.f4222c = builder;
        Context context = builder.f4206a;
        this.f4220a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4221b = Api26Impl.a(context, builder.r);
        } else {
            this.f4221b = new Notification.Builder(builder.f4206a);
        }
        Notification notification = builder.f4215u;
        Bundle[] bundleArr2 = null;
        int i3 = 2;
        int i4 = 0;
        this.f4221b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.f4209e).setContentText(builder.f).setContentInfo(null).setContentIntent(builder.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(builder.f4212l, builder.m, builder.f4213n);
        Notification.Builder builder2 = this.f4221b;
        IconCompat iconCompat = builder.f4210h;
        Api23Impl.b(builder2, iconCompat == null ? null : iconCompat.j(context));
        this.f4221b.setSubText(null).setUsesChronometer(false).setPriority(builder.f4211i);
        NotificationCompat.Style style = builder.k;
        if (style instanceof NotificationCompat.CallStyle) {
            NotificationCompat.CallStyle callStyle = (NotificationCompat.CallStyle) style;
            int color = ContextCompat.getColor(callStyle.f4217a.f4206a, R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) callStyle.f4217a.f4206a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = callStyle.f4217a.f4206a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            NotificationCompat.Action.Builder builder3 = new NotificationCompat.Action.Builder(IconCompat.e(context2.getResources(), context2.getPackageName(), 2131231224), spannableStringBuilder);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            NotificationCompat.Action action = new NotificationCompat.Action(builder3.f4195a, builder3.f4196b, (PendingIntent) null, builder3.d, arrayList4.isEmpty() ? null : (RemoteInput[]) arrayList4.toArray(new RemoteInput[arrayList4.size()]), arrayList3.isEmpty() ? null : (RemoteInput[]) arrayList3.toArray(new RemoteInput[arrayList3.size()]), builder3.f4197c, 0, builder3.f4198e, false, false);
            action.f4189a.putBoolean("key_action_priority", true);
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(action);
            ArrayList<NotificationCompat.Action> arrayList6 = callStyle.f4217a.f4207b;
            if (arrayList6 != null) {
                for (NotificationCompat.Action action2 : arrayList6) {
                    if (action2.g) {
                        arrayList5.add(action2);
                    } else if (!action2.f4189a.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList5.add(action2);
                        i3--;
                    }
                }
            }
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                b((NotificationCompat.Action) it.next());
            }
        } else {
            Iterator it2 = builder.f4207b.iterator();
            while (it2.hasNext()) {
                b((NotificationCompat.Action) it2.next());
            }
        }
        Bundle bundle = builder.f4214p;
        if (bundle != null) {
            this.d.putAll(bundle);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f4221b.setShowWhen(builder.j);
        Api20Impl.i(this.f4221b, builder.o);
        Api20Impl.g(this.f4221b, null);
        Api20Impl.j(this.f4221b, null);
        Api20Impl.h(this.f4221b, false);
        Api21Impl.b(this.f4221b, null);
        Api21Impl.c(this.f4221b, 0);
        Api21Impl.f(this.f4221b, 0);
        Api21Impl.d(this.f4221b, null);
        Api21Impl.e(this.f4221b, notification.sound, notification.audioAttributes);
        ArrayList arrayList7 = builder.v;
        ArrayList<Person> arrayList8 = builder.f4208c;
        if (i5 < 28) {
            if (arrayList8 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList8.size());
                for (Person person : arrayList8) {
                    String str = person.f4235c;
                    if (str == null) {
                        CharSequence charSequence = person.f4233a;
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList2.add(str);
                }
            }
            if (arrayList2 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList2;
                } else {
                    ArraySet arraySet = new ArraySet(arrayList7.size() + arrayList2.size());
                    arraySet.addAll(arrayList2);
                    arraySet.addAll(arrayList7);
                    arrayList7 = new ArrayList(arraySet);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                Api21Impl.a(this.f4221b, (String) it3.next());
            }
        }
        ArrayList arrayList9 = builder.d;
        if (arrayList9.size() > 0) {
            if (builder.f4214p == null) {
                builder.f4214p = new Bundle();
            }
            Bundle bundle2 = builder.f4214p.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList9.size()) {
                String string = Integer.toString(i6);
                NotificationCompat.Action action3 = (NotificationCompat.Action) arrayList9.get(i6);
                boolean z3 = z2;
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = action3.a();
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.f() : i4);
                bundle5.putCharSequence("title", action3.f4194i);
                bundle5.putParcelable("actionIntent", action3.j);
                Bundle bundle6 = action3.f4189a;
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", action3.d);
                bundle5.putBundle("extras", bundle7);
                RemoteInput[] remoteInputArr = action3.f4191c;
                if (remoteInputArr == null) {
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[remoteInputArr.length];
                    int i7 = 0;
                    while (i7 < remoteInputArr.length) {
                        RemoteInput remoteInput = remoteInputArr[i7];
                        ArrayList arrayList10 = arrayList8;
                        Bundle bundle8 = new Bundle();
                        RemoteInput[] remoteInputArr2 = remoteInputArr;
                        int i8 = i7;
                        bundle8.putString("resultKey", remoteInput.f4246a);
                        bundle8.putCharSequence("label", remoteInput.f4247b);
                        bundle8.putCharSequenceArray("choices", remoteInput.f4248c);
                        bundle8.putBoolean("allowFreeFormInput", remoteInput.d);
                        bundle8.putBundle("extras", remoteInput.f);
                        HashSet hashSet = remoteInput.g;
                        if (hashSet != null && !hashSet.isEmpty()) {
                            ArrayList<String> arrayList11 = new ArrayList<>(hashSet.size());
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                arrayList11.add((String) it4.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList11);
                        }
                        bundleArr[i8] = bundle8;
                        i7 = i8 + 1;
                        arrayList8 = arrayList10;
                        remoteInputArr = remoteInputArr2;
                    }
                }
                ArrayList arrayList12 = arrayList8;
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", action3.f4192e);
                bundle5.putInt("semanticAction", action3.f);
                bundle4.putBundle(string, bundle5);
                i6++;
                z2 = z3;
                arrayList9 = arrayList9;
                arrayList8 = arrayList12;
                bundleArr2 = null;
                i4 = 0;
            }
            arrayList = arrayList8;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (builder.f4214p == null) {
                builder.f4214p = new Bundle();
            }
            builder.f4214p.putBundle("android.car.EXTENSIONS", bundle2);
            this.d.putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            arrayList = arrayList8;
        }
        int i9 = Build.VERSION.SDK_INT;
        this.f4221b.setExtras(builder.f4214p);
        Api24Impl.e(this.f4221b, null);
        RemoteViews remoteViews = builder.q;
        if (remoteViews != null) {
            Api24Impl.b(this.f4221b, remoteViews);
        }
        if (i9 >= 26) {
            Api26Impl.b(this.f4221b, 0);
            Api26Impl.e(this.f4221b, null);
            Api26Impl.f(this.f4221b, null);
            Api26Impl.g(this.f4221b, 0L);
            Api26Impl.d(this.f4221b, 0);
            if (!TextUtils.isEmpty(builder.r)) {
                this.f4221b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i9 >= 28) {
            for (Person person2 : arrayList) {
                Notification.Builder builder4 = this.f4221b;
                person2.getClass();
                Api28Impl.a(builder4, Person.Api28Impl.b(person2));
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Api29Impl.a(this.f4221b, builder.t);
            Api29Impl.b(this.f4221b, null);
        }
        if (i10 < 31 || (i2 = builder.s) == 0) {
            return;
        }
        Api31Impl.b(this.f4221b, i2);
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public final Notification.Builder a() {
        return this.f4221b;
    }

    public final void b(NotificationCompat.Action action) {
        IconCompat iconCompatA = action.a();
        android.app.RemoteInput[] remoteInputArr = null;
        Notification.Action.Builder builderA = Api23Impl.a(iconCompatA != null ? iconCompatA.i() : null, action.f4194i, action.j);
        RemoteInput[] remoteInputArr2 = action.f4191c;
        if (remoteInputArr2 != null) {
            if (remoteInputArr2 != null) {
                remoteInputArr = new android.app.RemoteInput[remoteInputArr2.length];
                for (int i2 = 0; i2 < remoteInputArr2.length; i2++) {
                    remoteInputArr[i2] = RemoteInput.a(remoteInputArr2[i2]);
                }
            }
            for (android.app.RemoteInput remoteInput : remoteInputArr) {
                Api20Impl.c(builderA, remoteInput);
            }
        }
        Bundle bundle = action.f4189a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z2 = action.d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z2);
        int i3 = Build.VERSION.SDK_INT;
        Api24Impl.a(builderA, z2);
        int i4 = action.f;
        bundle2.putInt("android.support.action.semanticAction", i4);
        if (i3 >= 28) {
            Api28Impl.b(builderA, i4);
        }
        if (i3 >= 29) {
            Api29Impl.c(builderA, action.g);
        }
        if (i3 >= 31) {
            Api31Impl.a(builderA, action.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", action.f4192e);
        Api20Impl.b(builderA, bundle2);
        Api20Impl.a(this.f4221b, Api20Impl.d(builderA));
    }
}
