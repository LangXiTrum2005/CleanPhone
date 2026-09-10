package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import igbo.gintrap;
import igbo.kowloon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NotificationCompatBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f9245attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final List<Bundle> f9246beachfront = new ArrayList();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Bundle f9247competently = new Bundle();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final NotificationCompat.impassible f9248dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f9249impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public RemoteViews f9250marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Notification.Builder f9251saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public RemoteViews f9252taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public RemoteViews f9253wireman;

    /* JADX INFO: renamed from: androidx.core.app.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class C0058attabal {
        public static Notification.Builder attabal(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Builder beachfront(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder competently(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Action.Builder dern(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Builder impromptu(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static String marial(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Action.Builder saneness(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Builder taiyuan(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }

        public static Notification.Action wireman(Notification.Action.Builder builder) {
            return builder.build();
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class beachfront {
        public static Notification.Builder attabal(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder saneness(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class competently {
        public static Notification.Builder attabal(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Action.Builder dern(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder saneness(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Builder wireman(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class dern {
        public static Notification.Action.Builder attabal(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder dern(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        public static Notification.Builder saneness(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class impromptu {
        public static Notification.Action.Builder attabal(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder saneness(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class marial {
        public static Notification.Builder attabal(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder beachfront(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder competently(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }

        public static Notification.Builder dern(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder marial(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder saneness(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder wireman(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class saneness {
        public static Notification.Builder attabal(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder beachfront(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }

        public static Notification.Builder dern(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder marial(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder saneness(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder wireman(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class wireman {
        public static Notification.Action.Builder attabal(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder dern(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder marial(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        public static Notification.Builder saneness(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder wireman(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }
    }

    public attabal(NotificationCompat.impassible impassibleVar) {
        int i;
        this.f9248dern = impassibleVar;
        Context context = impassibleVar.f9161attabal;
        this.f9245attabal = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9251saneness = marial.attabal(context, impassibleVar.f9187polder);
        } else {
            this.f9251saneness = new Notification.Builder(impassibleVar.f9161attabal);
        }
        Notification notification = impassibleVar.f9186peridotite;
        this.f9251saneness.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, impassibleVar.f9201taiyuan).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(impassibleVar.f9179marial).setContentText(impassibleVar.f9162beachfront).setContentInfo(impassibleVar.f9159apical).setContentIntent(impassibleVar.f9163competently).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(impassibleVar.f9176impromptu, (notification.flags & 128) != 0).setNumber(impassibleVar.f9170formularize).setProgress(impassibleVar.f9172graveside, impassibleVar.f9158adultoid, impassibleVar.f9169dovishness);
        Notification.Builder builder = this.f9251saneness;
        IconCompat iconCompat = impassibleVar.f9167cutely;
        dern.saneness(builder, iconCompat == null ? null : iconCompat.toIcon(context));
        this.f9251saneness.setSubText(impassibleVar.f9183monoploid).setUsesChronometer(impassibleVar.f9178kowloon).setPriority(impassibleVar.f9175impassible);
        NotificationCompat.arytenoidectomy arytenoidectomyVar = impassibleVar.f9160arytenoidectomy;
        if (arytenoidectomyVar instanceof NotificationCompat.triweekly) {
            Iterator<NotificationCompat.saneness> it = ((NotificationCompat.triweekly) arytenoidectomyVar).impromptu().iterator();
            while (it.hasNext()) {
                saneness(it.next());
            }
        } else {
            Iterator<NotificationCompat.saneness> it2 = impassibleVar.f9193saneness.iterator();
            while (it2.hasNext()) {
                saneness(it2.next());
            }
        }
        Bundle bundle = impassibleVar.f9184oilcan;
        if (bundle != null) {
            this.f9247competently.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f9253wireman = impassibleVar.f9200supplicat;
        this.f9250marial = impassibleVar.f9191restrictive;
        this.f9251saneness.setShowWhen(impassibleVar.f9202triweekly);
        C0058attabal.impromptu(this.f9251saneness, impassibleVar.f9164cord);
        C0058attabal.beachfront(this.f9251saneness, impassibleVar.f9171gintrap);
        C0058attabal.taiyuan(this.f9251saneness, impassibleVar.f9189preprohormone);
        C0058attabal.competently(this.f9251saneness, impassibleVar.f9192rotuma);
        this.f9249impromptu = impassibleVar.f9165creditor;
        saneness.saneness(this.f9251saneness, impassibleVar.f9203trm);
        saneness.dern(this.f9251saneness, impassibleVar.f9206yemenite);
        saneness.beachfront(this.f9251saneness, impassibleVar.f9195sealless);
        saneness.wireman(this.f9251saneness, impassibleVar.f9177kattegat);
        saneness.marial(this.f9251saneness, notification.sound, notification.audioAttributes);
        List listMarial = i2 < 28 ? marial(competently(impassibleVar.f9168dern), impassibleVar.f9185overspeculate) : impassibleVar.f9185overspeculate;
        if (listMarial != null && !listMarial.isEmpty()) {
            Iterator it3 = listMarial.iterator();
            while (it3.hasNext()) {
                saneness.attabal(this.f9251saneness, (String) it3.next());
            }
        }
        this.f9252taiyuan = impassibleVar.f9181merc;
        if (impassibleVar.f9205wireman.size() > 0) {
            Bundle bundle2 = impassibleVar.dern().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < impassibleVar.f9205wireman.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), androidx.core.app.saneness.marial(impassibleVar.f9205wireman.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            impassibleVar.dern().putBundle("android.car.EXTENSIONS", bundle2);
            this.f9247competently.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = impassibleVar.f9197splinterproof;
        if (obj != null) {
            dern.dern(this.f9251saneness, obj);
        }
        this.f9251saneness.setExtras(impassibleVar.f9184oilcan);
        wireman.marial(this.f9251saneness, impassibleVar.f9182molybdenite);
        RemoteViews remoteViews = impassibleVar.f9200supplicat;
        if (remoteViews != null) {
            wireman.dern(this.f9251saneness, remoteViews);
        }
        RemoteViews remoteViews2 = impassibleVar.f9191restrictive;
        if (remoteViews2 != null) {
            wireman.saneness(this.f9251saneness, remoteViews2);
        }
        RemoteViews remoteViews3 = impassibleVar.f9181merc;
        if (remoteViews3 != null) {
            wireman.wireman(this.f9251saneness, remoteViews3);
        }
        if (i4 >= 26) {
            marial.saneness(this.f9251saneness, impassibleVar.f9196seminary);
            marial.marial(this.f9251saneness, impassibleVar.f9188polloi);
            marial.beachfront(this.f9251saneness, impassibleVar.f9173grimness);
            marial.competently(this.f9251saneness, impassibleVar.f9190privatdozent);
            marial.wireman(this.f9251saneness, impassibleVar.f9165creditor);
            if (impassibleVar.f9199stratoscope) {
                marial.dern(this.f9251saneness, impassibleVar.f9166cuirassed);
            }
            if (!TextUtils.isEmpty(impassibleVar.f9187polder)) {
                this.f9251saneness.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<androidx.core.app.dern> it4 = impassibleVar.f9168dern.iterator();
            while (it4.hasNext()) {
                beachfront.attabal(this.f9251saneness, it4.next().taiyuan());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            competently.attabal(this.f9251saneness, impassibleVar.f9174hydrovane);
            competently.saneness(this.f9251saneness, NotificationCompat.formularize.apical(impassibleVar.f9204walach));
            picketboat.wireman wiremanVar = impassibleVar.f9194saran;
            if (wiremanVar != null) {
                competently.wireman(this.f9251saneness, wiremanVar.saneness());
            }
        }
        if (i5 >= 31 && (i = impassibleVar.f9198starveling) != 0) {
            impromptu.saneness(this.f9251saneness, i);
        }
        if (impassibleVar.f9180mathsort) {
            if (this.f9248dern.f9192rotuma) {
                this.f9249impromptu = 2;
            } else {
                this.f9249impromptu = 1;
            }
            this.f9251saneness.setVibrate(null);
            this.f9251saneness.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.f9251saneness.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f9248dern.f9171gintrap)) {
                    C0058attabal.beachfront(this.f9251saneness, NotificationCompat.GROUP_KEY_SILENT);
                }
                marial.wireman(this.f9251saneness, this.f9249impromptu);
            }
        }
    }

    public static List<String> competently(List<androidx.core.app.dern> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<androidx.core.app.dern> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().impromptu());
        }
        return arrayList;
    }

    public static List<String> marial(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.saneness sanenessVar = new androidx.collection.saneness(list.size() + list2.size());
        sanenessVar.addAll(list);
        sanenessVar.addAll(list2);
        return new ArrayList(sanenessVar);
    }

    @Override // igbo.kowloon
    public Notification.Builder attabal() {
        return this.f9251saneness;
    }

    public Context beachfront() {
        return this.f9245attabal;
    }

    public Notification dern() {
        Bundle extras;
        RemoteViews remoteViewsBeachfront;
        RemoteViews remoteViewsWireman;
        NotificationCompat.arytenoidectomy arytenoidectomyVar = this.f9248dern.f9160arytenoidectomy;
        if (arytenoidectomyVar != null) {
            arytenoidectomyVar.saneness(this);
        }
        RemoteViews remoteViewsMarial = arytenoidectomyVar != null ? arytenoidectomyVar.marial(this) : null;
        Notification notificationWireman = wireman();
        if (remoteViewsMarial != null) {
            notificationWireman.contentView = remoteViewsMarial;
        } else {
            RemoteViews remoteViews = this.f9248dern.f9200supplicat;
            if (remoteViews != null) {
                notificationWireman.contentView = remoteViews;
            }
        }
        if (arytenoidectomyVar != null && (remoteViewsWireman = arytenoidectomyVar.wireman(this)) != null) {
            notificationWireman.bigContentView = remoteViewsWireman;
        }
        if (arytenoidectomyVar != null && (remoteViewsBeachfront = this.f9248dern.f9160arytenoidectomy.beachfront(this)) != null) {
            notificationWireman.headsUpContentView = remoteViewsBeachfront;
        }
        if (arytenoidectomyVar != null && (extras = NotificationCompat.getExtras(notificationWireman)) != null) {
            arytenoidectomyVar.attabal(extras);
        }
        return notificationWireman;
    }

    public final void impromptu(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public final void saneness(NotificationCompat.saneness sanenessVar) {
        IconCompat iconCompatWireman = sanenessVar.wireman();
        Notification.Action.Builder builderAttabal = dern.attabal(iconCompatWireman != null ? iconCompatWireman.toIcon() : null, sanenessVar.impromptu(), sanenessVar.attabal());
        if (sanenessVar.marial() != null) {
            for (RemoteInput remoteInput : gintrap.saneness(sanenessVar.marial())) {
                C0058attabal.dern(builderAttabal, remoteInput);
            }
        }
        Bundle bundle = sanenessVar.dern() != null ? new Bundle(sanenessVar.dern()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", sanenessVar.saneness());
        int i = Build.VERSION.SDK_INT;
        wireman.attabal(builderAttabal, sanenessVar.saneness());
        bundle.putInt("android.support.action.semanticAction", sanenessVar.beachfront());
        if (i >= 28) {
            beachfront.saneness(builderAttabal, sanenessVar.beachfront());
        }
        if (i >= 29) {
            competently.dern(builderAttabal, sanenessVar.cutely());
        }
        if (i >= 31) {
            impromptu.attabal(builderAttabal, sanenessVar.taiyuan());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", sanenessVar.competently());
        C0058attabal.saneness(builderAttabal, bundle);
        C0058attabal.attabal(this.f9251saneness, C0058attabal.wireman(builderAttabal));
    }

    public Notification wireman() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f9251saneness.build();
        }
        Notification notificationBuild = this.f9251saneness.build();
        if (this.f9249impromptu != 0) {
            if (C0058attabal.marial(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f9249impromptu == 2) {
                impromptu(notificationBuild);
            }
            if (C0058attabal.marial(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f9249impromptu == 1) {
                impromptu(notificationBuild);
            }
        }
        return notificationBuild;
    }
}
