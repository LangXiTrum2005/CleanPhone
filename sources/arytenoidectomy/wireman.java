package arytenoidectomy;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ICustomTabsService f14396attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Context f14397dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ComponentName f14398saneness;

    /* JADX INFO: compiled from: CustomTabsClient.java */
    public class attabal extends ICustomTabsCallback.Stub {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Handler f14399dern = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ arytenoidectomy.dern f14401wireman;

        /* JADX INFO: renamed from: arytenoidectomy.wireman$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class RunnableC0117attabal implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Bundle f14403kowloon;

            public RunnableC0117attabal(Bundle bundle) {
                this.f14403kowloon = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onUnminimized(this.f14403kowloon);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class beachfront implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ Uri f14404arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ int f14405kowloon;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final /* synthetic */ boolean f14407monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public final /* synthetic */ Bundle f14408polloi;

            public beachfront(int i, Uri uri, boolean z, Bundle bundle) {
                this.f14405kowloon = i;
                this.f14404arytenoidectomy = uri;
                this.f14407monoploid = z;
                this.f14408polloi = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onRelationshipValidationResult(this.f14405kowloon, this.f14404arytenoidectomy, this.f14407monoploid, this.f14408polloi);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class competently implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ int f14409arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ int f14410kowloon;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final /* synthetic */ Bundle f14411monoploid;

            public competently(int i, int i2, Bundle bundle) {
                this.f14410kowloon = i;
                this.f14409arytenoidectomy = i2;
                this.f14411monoploid = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onActivityResized(this.f14410kowloon, this.f14409arytenoidectomy, this.f14411monoploid);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class cutely implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Bundle f14414kowloon;

            public cutely(Bundle bundle) {
                this.f14414kowloon = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onMinimized(this.f14414kowloon);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class dern implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ Bundle f14415arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ String f14416kowloon;

            public dern(String str, Bundle bundle) {
                this.f14416kowloon = str;
                this.f14415arytenoidectomy = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.extraCallback(this.f14416kowloon, this.f14415arytenoidectomy);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class impromptu implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Bundle f14419kowloon;

            public impromptu(Bundle bundle) {
                this.f14419kowloon = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onWarmupCompleted(this.f14419kowloon);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class marial implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ Bundle f14420arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ String f14421kowloon;

            public marial(String str, Bundle bundle) {
                this.f14421kowloon = str;
                this.f14420arytenoidectomy = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onPostMessage(this.f14421kowloon, this.f14420arytenoidectomy);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class saneness implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ Bundle f14423arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ int f14424kowloon;

            public saneness(int i, Bundle bundle) {
                this.f14424kowloon = i;
                this.f14423arytenoidectomy = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onNavigationEvent(this.f14424kowloon, this.f14423arytenoidectomy);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class taiyuan implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ int f14427arytenoidectomy;

            /* JADX INFO: renamed from: graveside, reason: collision with root package name */
            public final /* synthetic */ Bundle f14428graveside;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ int f14429kowloon;

            /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
            public final /* synthetic */ int f14430molybdenite;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final /* synthetic */ int f14431monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public final /* synthetic */ int f14432polloi;

            public taiyuan(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                this.f14429kowloon = i;
                this.f14427arytenoidectomy = i2;
                this.f14431monoploid = i3;
                this.f14432polloi = i4;
                this.f14430molybdenite = i5;
                this.f14428graveside = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onActivityLayout(this.f14429kowloon, this.f14427arytenoidectomy, this.f14431monoploid, this.f14432polloi, this.f14430molybdenite, this.f14428graveside);
            }
        }

        /* JADX INFO: renamed from: arytenoidectomy.wireman$attabal$wireman, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class RunnableC0118wireman implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Bundle f14434kowloon;

            public RunnableC0118wireman(Bundle bundle) {
                this.f14434kowloon = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                attabal.this.f14401wireman.onMessageChannelReady(this.f14434kowloon);
            }
        }

        public attabal(arytenoidectomy.dern dernVar) {
            this.f14401wireman = dernVar;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new dern(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
            arytenoidectomy.dern dernVar = this.f14401wireman;
            if (dernVar == null) {
                return null;
            }
            return dernVar.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new taiyuan(i, i2, i3, i4, i5, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new competently(i, i2, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new RunnableC0118wireman(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new cutely(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new saneness(i, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new marial(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new beachfront(i, uri, z, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new RunnableC0117attabal(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) throws RemoteException {
            if (this.f14401wireman == null) {
                return;
            }
            this.f14399dern.post(new impromptu(bundle));
        }
    }

    public wireman(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f14396attabal = iCustomTabsService;
        this.f14398saneness = componentName;
        this.f14397dern = context;
    }

    public static boolean attabal(Context context, String str, competently competentlyVar) {
        competentlyVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, competentlyVar, 33);
    }

    public static String dern(Context context, List<String> list) {
        return wireman(context, list, false);
    }

    public static String wireman(Context context, List<String> list, boolean z) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public final apical beachfront(dern dernVar, PendingIntent pendingIntent) {
        boolean zNewSession;
        ICustomTabsCallback.Stub stubSaneness = saneness(dernVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zNewSession = this.f14396attabal.newSessionWithExtras(stubSaneness, bundle);
            } else {
                zNewSession = this.f14396attabal.newSession(stubSaneness);
            }
            if (zNewSession) {
                return new apical(this.f14396attabal, stubSaneness, this.f14398saneness, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean competently(long j) {
        try {
            return this.f14396attabal.warmup(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public apical marial(dern dernVar) {
        return beachfront(dernVar, null);
    }

    public final ICustomTabsCallback.Stub saneness(dern dernVar) {
        return new attabal(dernVar);
    }
}
