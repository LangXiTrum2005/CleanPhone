package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final Runnable f13580apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f13581attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.room.dern f13582beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Executor f13583competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final ServiceConnection f13584cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f13585dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final Runnable f13586formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final Runnable f13587impassible;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final androidx.room.wireman.dern f13589marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f13590saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final androidx.room.wireman f13592wireman;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final androidx.room.saneness f13588impromptu = new attabal();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final AtomicBoolean f13591taiyuan = new AtomicBoolean(false);

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class attabal extends androidx.room.saneness.attabal {

        /* JADX INFO: renamed from: androidx.room.marial$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
        public class RunnableC0101attabal implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ String[] f13595kowloon;

            public RunnableC0101attabal(String[] strArr) {
                this.f13595kowloon = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                marial.this.f13592wireman.marial(this.f13595kowloon);
            }
        }

        public attabal() {
        }

        @Override // androidx.room.saneness
        public void attabal(String[] strArr) {
            marial.this.f13583competently.execute(new RunnableC0101attabal(strArr));
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class beachfront extends androidx.room.wireman.dern {
        public beachfront(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.wireman.dern
        public boolean attabal() {
            return true;
        }

        @Override // androidx.room.wireman.dern
        public void saneness(Set<String> set) {
            if (marial.this.f13591taiyuan.get()) {
                return;
            }
            try {
                marial marialVar = marial.this;
                androidx.room.dern dernVar = marialVar.f13582beachfront;
                if (dernVar != null) {
                    dernVar.competently(marialVar.f13585dern, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class dern implements Runnable {
        public dern() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                marial marialVar = marial.this;
                androidx.room.dern dernVar = marialVar.f13582beachfront;
                if (dernVar != null) {
                    marialVar.f13585dern = dernVar.impromptu(marialVar.f13588impromptu, marialVar.f13590saneness);
                    marial marialVar2 = marial.this;
                    marialVar2.f13592wireman.attabal(marialVar2.f13589marial);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.marial$marial, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class RunnableC0102marial implements Runnable {
        public RunnableC0102marial() {
        }

        @Override // java.lang.Runnable
        public void run() {
            marial marialVar = marial.this;
            marialVar.f13592wireman.competently(marialVar.f13589marial);
            try {
                marial marialVar2 = marial.this;
                androidx.room.dern dernVar = marialVar2.f13582beachfront;
                if (dernVar != null) {
                    dernVar.taiyuan(marialVar2.f13588impromptu, marialVar2.f13585dern);
                }
            } catch (RemoteException unused) {
            }
            marial marialVar3 = marial.this;
            marialVar3.f13581attabal.unbindService(marialVar3.f13584cutely);
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class saneness implements ServiceConnection {
        public saneness() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            marial.this.f13582beachfront = androidx.room.dern.attabal.cutely(iBinder);
            marial marialVar = marial.this;
            marialVar.f13583competently.execute(marialVar.f13580apical);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            marial marialVar = marial.this;
            marialVar.f13583competently.execute(marialVar.f13586formularize);
            marial.this.f13582beachfront = null;
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    public class wireman implements Runnable {
        public wireman() {
        }

        @Override // java.lang.Runnable
        public void run() {
            marial marialVar = marial.this;
            marialVar.f13592wireman.competently(marialVar.f13589marial);
        }
    }

    public marial(Context context, String str, androidx.room.wireman wiremanVar, Executor executor) {
        saneness sanenessVar = new saneness();
        this.f13584cutely = sanenessVar;
        this.f13580apical = new dern();
        this.f13586formularize = new wireman();
        this.f13587impassible = new RunnableC0102marial();
        Context applicationContext = context.getApplicationContext();
        this.f13581attabal = applicationContext;
        this.f13590saneness = str;
        this.f13592wireman = wiremanVar;
        this.f13583competently = executor;
        this.f13589marial = new beachfront((String[]) wiremanVar.f13604attabal.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), sanenessVar, 1);
    }
}
