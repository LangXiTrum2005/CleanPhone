package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new walach();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Map<String, String> f22557arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Bundle f22558kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public saneness f22559monoploid;

    public static class saneness {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public final boolean f22560adultoid;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public final String f22561apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Integer f22562arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f22563attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final String[] f22564beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final String f22565competently;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public final long[] f22566cord;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final String f22567cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final String[] f22568dern;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public final boolean f22569dovishness;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public final String f22570formularize;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public final boolean f22571gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final Long f22572graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public final String f22573impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final String f22574impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final String f22575kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final String f22576marial;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final int[] f22577molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final Integer f22578monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final Integer f22579polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public final boolean f22580preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public final boolean f22581rotuma;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f22582saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final String f22583taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public final Uri f22584triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final String f22585wireman;

        public static String[] dern(polder polderVar, String str) {
            Object[] objArrCompetently = polderVar.competently(str);
            if (objArrCompetently == null) {
                return null;
            }
            String[] strArr = new String[objArrCompetently.length];
            for (int i = 0; i < objArrCompetently.length; i++) {
                strArr[i] = String.valueOf(objArrCompetently[i]);
            }
            return strArr;
        }

        public String attabal() {
            return this.f22585wireman;
        }

        public Uri saneness() {
            String str = this.f22574impromptu;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public String wireman() {
            return this.f22563attabal;
        }

        public saneness(polder polderVar) {
            this.f22563attabal = polderVar.arytenoidectomy("gcm.n.title");
            this.f22582saneness = polderVar.impromptu("gcm.n.title");
            this.f22568dern = dern(polderVar, "gcm.n.title");
            this.f22585wireman = polderVar.arytenoidectomy("gcm.n.body");
            this.f22576marial = polderVar.impromptu("gcm.n.body");
            this.f22564beachfront = dern(polderVar, "gcm.n.body");
            this.f22565competently = polderVar.arytenoidectomy("gcm.n.icon");
            this.f22583taiyuan = polderVar.kowloon();
            this.f22567cutely = polderVar.arytenoidectomy("gcm.n.tag");
            this.f22561apical = polderVar.arytenoidectomy("gcm.n.color");
            this.f22570formularize = polderVar.arytenoidectomy("gcm.n.click_action");
            this.f22573impassible = polderVar.arytenoidectomy("gcm.n.android_channel_id");
            this.f22584triweekly = polderVar.beachfront();
            this.f22574impromptu = polderVar.arytenoidectomy("gcm.n.image");
            this.f22575kowloon = polderVar.arytenoidectomy("gcm.n.ticker");
            this.f22562arytenoidectomy = polderVar.saneness("gcm.n.notification_priority");
            this.f22578monoploid = polderVar.saneness("gcm.n.visibility");
            this.f22579polloi = polderVar.saneness("gcm.n.notification_count");
            this.f22560adultoid = polderVar.attabal("gcm.n.sticky");
            this.f22569dovishness = polderVar.attabal("gcm.n.local_only");
            this.f22571gintrap = polderVar.attabal("gcm.n.default_sound");
            this.f22581rotuma = polderVar.attabal("gcm.n.default_vibrate_timings");
            this.f22580preprohormone = polderVar.attabal("gcm.n.default_light_settings");
            this.f22572graveside = polderVar.cutely("gcm.n.event_time");
            this.f22577molybdenite = polderVar.marial();
            this.f22566cord = polderVar.monoploid();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f22558kowloon = bundle;
    }

    public Map<String, String> getData() {
        if (this.f22557arytenoidectomy == null) {
            this.f22557arytenoidectomy = marial.attabal.attabal(this.f22558kowloon);
        }
        return this.f22557arytenoidectomy;
    }

    public String getMessageId() {
        String string = this.f22558kowloon.getString("google.message_id");
        return string == null ? this.f22558kowloon.getString("message_id") : string;
    }

    public saneness saneness() {
        if (this.f22559monoploid == null && polder.graveside(this.f22558kowloon)) {
            this.f22559monoploid = new saneness(new polder(this.f22558kowloon));
        }
        return this.f22559monoploid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        walach.dern(this, parcel, i);
    }
}
