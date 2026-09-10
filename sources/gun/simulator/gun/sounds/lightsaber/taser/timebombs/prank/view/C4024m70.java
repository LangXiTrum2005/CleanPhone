package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4024m70 extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4682a;
    public Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4024m70(BR br) {
        this(br, 2);
        this.f4682a = 2;
    }

    public final void a() {
        ((Ia0) this.b).c.b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = 6;
        int i2 = 2;
        switch (this.f4682a) {
            case 0:
                C4200o70 c4200o70 = (C4200o70) this.b;
                c4200o70.getClass();
                C4200o70.g.execute(new RunnableC4112n70(c4200o70, 2));
                break;
            case 1:
                N90 n90 = (N90) this.b;
                n90.b.post(new RunnableC2928Zc(n90, i));
                break;
            case 2:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i2 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i2 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Ug0.f3833a >= 29) {
                                            i = 0;
                                        } else {
                                            i = 9;
                                        }
                                        break;
                                }
                                i2 = i;
                            } else if (type != 1) {
                                if (type == 4 || type == 5) {
                                    switch (activeNetworkInfo.getSubtype()) {
                                        case 1:
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 14:
                                        case 15:
                                        case 17:
                                            i = 4;
                                            break;
                                        case 13:
                                            i = 5;
                                            break;
                                        case 18:
                                            i = 2;
                                            break;
                                        case 20:
                                            if (Ug0.f3833a >= 29) {
                                                i = 0;
                                            } else {
                                                i = 9;
                                            }
                                            break;
                                    }
                                    i2 = i;
                                } else if (type != 6) {
                                    i2 = type != 9 ? 8 : 7;
                                } else {
                                    i2 = 5;
                                }
                            }
                        }
                    } catch (SecurityException unused) {
                        i2 = 0;
                    }
                }
                if (Ug0.f3833a < 31 || i2 != 5) {
                    BR.a(i2, (BR) this.b);
                } else {
                    BR br = (BR) this.b;
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        AR ar = new AR(br);
                        telephonyManager.registerTelephonyCallback(context.getMainExecutor(), ar);
                        telephonyManager.unregisterTelephonyCallback(ar);
                    } catch (RuntimeException unused2) {
                        BR.a(5, br);
                        return;
                    }
                }
                break;
            case 3:
                Ia0 ia0 = (Ia0) this.b;
                if (ia0 != null && ia0.a()) {
                    Ia0 ia1 = (Ia0) this.b;
                    ia1.c.getClass();
                    FirebaseMessaging.b(0L, ia1);
                    ((Ia0) this.b).c.b.unregisterReceiver(this);
                    this.b = null;
                }
                break;
            case 4:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    C4699to0 c4699to0 = (C4699to0) this.b;
                    c4699to0.a(true, c4699to0.c);
                    ((C4699to0) this.b).b = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    C4699to0 c4699to1 = (C4699to0) this.b;
                    c4699to1.a(false, c4699to1.c);
                    ((C4699to0) this.b).b = false;
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    C4611so0 c4611so0 = (C4611so0) this.b;
                    c4611so0.a(true, c4611so0.c);
                    ((C4611so0) this.b).b = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    C4611so0 c4611so1 = (C4611so0) this.b;
                    c4611so1.a(false, c4611so1.c);
                    ((C4611so0) this.b).b = false;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4024m70(N90 n90) {
        this(n90, 1);
        this.f4682a = 1;
    }

    public C4024m70(Ia0 ia0) {
        this.f4682a = 3;
        this.b = ia0;
    }

    public /* synthetic */ C4024m70(Object obj, int i) {
        this.f4682a = i;
        this.b = obj;
    }
}
