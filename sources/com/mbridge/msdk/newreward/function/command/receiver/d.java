package com.mbridge.msdk.newreward.function.command.receiver;

import android.text.TextUtils;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.j;
import com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.k;
import com.mbridge.msdk.newreward.function.command.receiver.showreceiver.g;
import com.mbridge.msdk.newreward.function.command.receiver.showreceiver.h;
import com.mbridge.msdk.newreward.function.command.receiver.showreceiver.i;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    private static volatile d c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<f, Object> f1641a;
    private ConcurrentHashMap<String, Object> b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1642a;

        static {
            int[] iArr = new int[f.values().length];
            f1642a = iArr;
            try {
                iArr[f.RESTORE_DB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1642a[f.SMART_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1642a[f.CAMPAIGN_REDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1642a[f.SHOW_ADD_TEMPLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1642a[f.SHOW_LIFE_CYCLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1642a[f.SHOW_OR_PRELOAD_WEB_EC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1642a[f.NORMAL_LOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1642a[f.PRE_HANDLE_LOAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1642a[f.UNIT_INIT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1642a[f.BUILD_MORE_OFFER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1642a[f.CHECK_IS_REQUEST_CONTROL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1642a[f.UPDATE_CAM_TOKEN_RULE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1642a[f.START_LOAD_CHECK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1642a[f.CANDIDATE_LOAD_ACTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1642a[f.TEMP_PLAYER_INIT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1642a[f.TEMP_PLAY_START_COUNT_DOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1642a[f.TEMP_PLAY_PROGRESS_COUNT_DOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1642a[f.ADD_SHAKE_VIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f1642a[f.ADD_BAIT_CLICK.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    private d() {
    }

    public static d a() {
        if (c == null) {
            synchronized (d.class) {
                try {
                    if (c == null) {
                        c = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public <T extends b> T b(f fVar) {
        int i = a.f1642a[fVar.ordinal()];
        if (i == 3) {
            return new g();
        }
        if (i == 4) {
            return new com.mbridge.msdk.newreward.function.command.receiver.showreceiver.b();
        }
        if (i == 5) {
            return new com.mbridge.msdk.newreward.function.command.receiver.showreceiver.a();
        }
        if (i != 6) {
            return null;
        }
        if (this.f1641a == null) {
            this.f1641a = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<f, Object> concurrentHashMap = this.f1641a;
        f fVar2 = f.SHOW_OR_PRELOAD_WEB_EC;
        h hVar = concurrentHashMap.containsKey(fVar2) ? (h) this.f1641a.get(fVar2) : null;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        this.f1641a.put(fVar2, hVar2);
        return hVar2;
    }

    public <T extends e> T c(f fVar) {
        switch (a.f1642a[fVar.ordinal()]) {
            case 11:
                return new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.f();
            case 12:
                return new k();
            case 13:
                return new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.c();
            case 14:
                if (this.f1641a == null) {
                    this.f1641a = new ConcurrentHashMap<>();
                }
                ConcurrentHashMap<f, Object> concurrentHashMap = this.f1641a;
                f fVar2 = f.CANDIDATE_LOAD_ACTION;
                T t = concurrentHashMap.containsKey(fVar2) ? (T) this.f1641a.get(fVar2) : null;
                if (t != null) {
                    return t;
                }
                com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.a aVar = new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.a();
                this.f1641a.put(fVar2, aVar);
                return aVar;
            case 15:
            case 16:
            case 17:
                return new com.mbridge.msdk.newreward.function.command.receiver.showreceiver.f(fVar);
            case 18:
            case 19:
                return new com.mbridge.msdk.newreward.function.command.receiver.showreceiver.c(fVar);
            default:
                return null;
        }
    }

    public void d(f fVar) {
        ConcurrentHashMap<f, Object> concurrentHashMap;
        if (fVar == null || (concurrentHashMap = this.f1641a) == null) {
            return;
        }
        concurrentHashMap.remove(fVar);
    }

    public <T extends b> T a(f fVar, String str) {
        if (fVar != f.SHOW_OR_PRELOAD_WEB_TEMPLATE) {
            return null;
        }
        if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
        i iVar = this.b.containsKey(str) ? (i) this.b.get(str) : null;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i();
        this.b.put(str, iVar2);
        return iVar2;
    }

    public <T extends com.mbridge.msdk.newreward.function.command.receiver.a> T a(f fVar) {
        int i = a.f1642a[fVar.ordinal()];
        if (i == 1) {
            return new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.g();
        }
        if (i == 2) {
            return new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.i();
        }
        if (i != 4) {
            switch (i) {
                case 7:
                    return new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.d();
                case 8:
                    return new com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.e();
                case 9:
                    return new j();
                case 10:
                    return new com.mbridge.msdk.newreward.function.command.receiver.showreceiver.e();
                default:
                    return null;
            }
        }
        return new com.mbridge.msdk.newreward.function.command.receiver.showreceiver.d();
    }

    public void a(String str) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.b) == null) {
            return;
        }
        concurrentHashMap.remove(str);
    }
}
