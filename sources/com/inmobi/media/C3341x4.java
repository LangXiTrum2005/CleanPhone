package com.inmobi.media;

import duvetyn.beachfront;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.TimeoutKt;
import okhttp3.Protocol;
import okhttp3.adultoid;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.dovishness;
import okhttp3.kowloon;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import okhttp3.stratoscope;
import okio.ByteString;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3341x4 {
    public final adultoid[] a;
    public final rotuma b;
    public final long c;

    public C3341x4(adultoid[] adultoidVarArr, adultoid[] adultoidVarArr2, kowloon dispatcher, C3158pk timeoutConfig) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.a = adultoidVarArr2;
        this.c = timeoutConfig.c;
        rotuma.attabal attabalVar = new rotuma.attabal();
        if (adultoidVarArr != null) {
            for (adultoid adultoidVar : adultoidVarArr) {
                attabalVar.attabal(adultoidVar);
            }
        }
        adultoid[] adultoidVarArr3 = this.a;
        if (adultoidVarArr3 != null) {
            for (adultoid adultoidVar2 : adultoidVarArr3) {
                attabalVar.saneness(adultoidVar2);
            }
        }
        attabalVar.attabal(new C3405zi());
        attabalVar.saneness(new Xb());
        attabalVar.creditor(p002kotlin.collections.adultoid.polloi(Protocol.HTTP_2, Protocol.HTTP_1_1));
        attabalVar.walach(false);
        attabalVar.impromptu(dispatcher);
        long j = timeoutConfig.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        attabalVar.beachfront(j, timeUnit);
        attabalVar.hydrovane(timeoutConfig.b, timeUnit);
        rotuma rotumaVarDern = attabalVar.dern();
        Intrinsics.checkNotNullExpressionValue(rotumaVarDern, "build(...)");
        this.b = rotumaVarDern;
    }

    public static Pair a(Me me2) {
        cord c3266u4;
        preprohormone.attabal attabalVarGraveside = new preprohormone.attabal().graveside(me2.c());
        Map mapA = me2.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                attabalVarGraveside.attabal((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Ai aiB = me2.b();
        if (aiB != null) {
            attabalVarGraveside.molybdenite(aiB);
        }
        if (me2 instanceof Je) {
            attabalVarGraveside.wireman();
        } else if (me2 instanceof Le) {
            try {
                AbstractC3280ui abstractC3280ui = ((Le) me2).d;
                if (abstractC3280ui == null) {
                    c3266u4 = cord.create((dovishness) null, new byte[0]);
                    Intrinsics.beachfront(c3266u4);
                } else {
                    c3266u4 = new C3266u4(abstractC3280ui);
                }
                attabalVarGraveside.apical(c3266u4);
            } catch (FileNotFoundException e) {
                e.getStackTrace();
                return new Pair(attabalVarGraveside.saneness(), new C2791b6(((Le) me2).a, EnumC2765a6.m));
            } catch (IOException e2) {
                e2.getStackTrace();
                return new Pair(attabalVarGraveside.saneness(), new C2791b6(((Le) me2).a, EnumC2765a6.e));
            } catch (Exception e3) {
                e3.getStackTrace();
                return new Pair(attabalVarGraveside.saneness(), new C2791b6(((Le) me2).a, EnumC2765a6.d));
            }
        } else {
            if (!(me2 instanceof Ke)) {
                throw new NoWhenBranchMatchedException();
            }
            attabalVarGraveside.competently();
        }
        return new Pair(attabalVarGraveside.saneness(), null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0146  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0176  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(rotuma rotumaVar, preprohormone preprohormoneVar, String str, ContinuationImpl continuationImpl) throws Throwable {
        C3291v4 c3291v4;
        String str2;
        String str3;
        ByteString byteString;
        Object oe;
        dovishness f34696kowloon;
        beachfront f34697monoploid;
        if (continuationImpl instanceof C3291v4) {
            c3291v4 = (C3291v4) continuationImpl;
            int i = c3291v4.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3291v4.d = i - Integer.MIN_VALUE;
            } else {
                c3291v4 = new C3291v4(this, continuationImpl);
            }
        } else {
            c3291v4 = new C3291v4(this, continuationImpl);
        }
        Object objDern = c3291v4.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3291v4.d;
        cuirassed cuirassedVar = null;
        mediaType = null;
        String mediaType = null;
        cuirassedVar = null;
        cuirassedVar = null;
        cuirassedVar = null;
        cuirassedVar = null;
        cuirassed cuirassedVar2 = null;
        cuirassed cuirassedVar3 = null;
        cuirassed cuirassedVar4 = null;
        cuirassed cuirassedVar5 = null;
        try {
            try {
                if (i2 == 0) {
                    dern.saneness(objDern);
                    try {
                        long millis = TimeUnit.SECONDS.toMillis(this.c);
                        C3316w4 c3316w4 = new C3316w4(rotumaVar, preprohormoneVar, null);
                        str2 = str;
                        try {
                            c3291v4.a = str2;
                            c3291v4.d = 1;
                            objDern = TimeoutKt.dern(millis, c3316w4, c3291v4);
                            if (objDern == objBeachfront) {
                                return objBeachfront;
                            }
                            str3 = str2;
                        } catch (MalformedURLException e) {
                            e = e;
                            str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2791b6 c2791b6 = new C2791b6(str3, EnumC2765a6.p);
                            if (cuirassedVar2 != null) {
                                cuirassedVar2.close();
                            }
                            return c2791b6;
                        } catch (SocketTimeoutException e2) {
                            e = e2;
                            str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2791b6 c2791b7 = new C2791b6(str3, EnumC2765a6.q);
                            if (cuirassedVar3 != null) {
                                cuirassedVar3.close();
                            }
                            return c2791b7;
                        } catch (IOException e3) {
                            e = e3;
                            str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2791b6 c2791b8 = new C2791b6(str3, EnumC2765a6.e);
                            if (cuirassedVar4 != null) {
                                cuirassedVar4.close();
                            }
                            return c2791b8;
                        } catch (Exception e4) {
                            e = e4;
                            str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2791b6 c2791b9 = new C2791b6(str3, EnumC2765a6.d);
                            if (cuirassedVar5 != null) {
                                cuirassedVar5.close();
                            }
                            return c2791b9;
                        }
                    } catch (MalformedURLException e5) {
                        e = e5;
                        str2 = str;
                    } catch (SocketTimeoutException e6) {
                        e = e6;
                        str2 = str;
                    } catch (IOException e7) {
                        e = e7;
                        str2 = str;
                    } catch (Exception e8) {
                        e = e8;
                        str2 = str;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = c3291v4.a;
                    try {
                        dern.saneness(objDern);
                    } catch (MalformedURLException e9) {
                        e = e9;
                        Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2791b6 c2791b10 = new C2791b6(str3, EnumC2765a6.p);
                        if (cuirassedVar2 != null) {
                            cuirassedVar2.close();
                        }
                        return c2791b10;
                    } catch (SocketTimeoutException e10) {
                        e = e10;
                        Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2791b6 c2791b11 = new C2791b6(str3, EnumC2765a6.q);
                        if (cuirassedVar3 != null) {
                            cuirassedVar3.close();
                        }
                        return c2791b11;
                    } catch (IOException e11) {
                        e = e11;
                        Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2791b6 c2791b12 = new C2791b6(str3, EnumC2765a6.e);
                        if (cuirassedVar4 != null) {
                            cuirassedVar4.close();
                        }
                        return c2791b12;
                    } catch (Exception e12) {
                        e = e12;
                        Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2791b6 c2791b13 = new C2791b6(str3, EnumC2765a6.d);
                        if (cuirassedVar5 != null) {
                            cuirassedVar5.close();
                        }
                        return c2791b13;
                    }
                }
                cuirassed cuirassedVar6 = (cuirassed) objDern;
                try {
                    int code = cuirassedVar6.getCode();
                    stratoscope body = cuirassedVar6.getBody();
                    if (body == null || (f34697monoploid = body.getBodySource()) == null || (byteString = f34697monoploid.readByteString()) == null) {
                        byteString = ByteString.EMPTY;
                    }
                    Map<String, List<String>> mapCompetently = cuirassedVar6.getHeaders().competently();
                    stratoscope body2 = cuirassedVar6.getBody();
                    long f34695arytenoidectomy = body2 != null ? body2.getContentLength() : 0L;
                    stratoscope body3 = cuirassedVar6.getBody();
                    if (body3 != null && (f34696kowloon = body3.getF34696kowloon()) != null) {
                        mediaType = f34696kowloon.getMediaType();
                    }
                    long receivedResponseAtMillis = cuirassedVar6.getReceivedResponseAtMillis() - cuirassedVar6.getSentRequestAtMillis();
                    long j = 0;
                    if (receivedResponseAtMillis >= 0) {
                        j = receivedResponseAtMillis;
                    }
                    Intrinsics.beachfront(mapCompetently);
                    Ie ie = new Ie(j, mapCompetently, (int) f34695arytenoidectomy, mediaType);
                    Intrinsics.checkNotNullParameter(cuirassedVar6, "<this>");
                    int code2 = cuirassedVar6.getCode();
                    if (400 <= code2 && code2 < 600) {
                        EnumC2765a6.b.getClass();
                        oe = new C2791b6(str3, Y5.a(code));
                    } else {
                        oe = new Oe(str3, code, byteString, ie);
                    }
                    cuirassedVar6.close();
                    return oe;
                } catch (MalformedURLException e13) {
                    e = e13;
                    cuirassedVar2 = cuirassedVar6;
                    Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2791b6 c2791b14 = new C2791b6(str3, EnumC2765a6.p);
                    if (cuirassedVar2 != null) {
                        cuirassedVar2.close();
                    }
                    return c2791b14;
                } catch (SocketTimeoutException e14) {
                    e = e14;
                    cuirassedVar3 = cuirassedVar6;
                    Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2791b6 c2791b15 = new C2791b6(str3, EnumC2765a6.q);
                    if (cuirassedVar3 != null) {
                        cuirassedVar3.close();
                    }
                    return c2791b15;
                } catch (IOException e15) {
                    e = e15;
                    cuirassedVar4 = cuirassedVar6;
                    Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2791b6 c2791b16 = new C2791b6(str3, EnumC2765a6.e);
                    if (cuirassedVar4 != null) {
                        cuirassedVar4.close();
                    }
                    return c2791b16;
                } catch (CancellationException e16) {
                    e = e16;
                    Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                    throw e;
                } catch (Exception e17) {
                    e = e17;
                    cuirassedVar5 = cuirassedVar6;
                    Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2791b6 c2791b17 = new C2791b6(str3, EnumC2765a6.d);
                    if (cuirassedVar5 != null) {
                        cuirassedVar5.close();
                    }
                    return c2791b17;
                } catch (Throwable th) {
                    th = th;
                    cuirassedVar = cuirassedVar6;
                    if (cuirassedVar != null) {
                        cuirassedVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (CancellationException e18) {
            e = e18;
        }
    }

    public final Object a(Me me2, ContinuationImpl continuationImpl) {
        rotuma rotumaVar = this.b;
        Pair pairA = a(me2);
        preprohormone preprohormoneVar = (preprohormone) pairA.component1();
        C2791b6 c2791b6 = (C2791b6) pairA.component2();
        return c2791b6 != null ? c2791b6 : a(rotumaVar, preprohormoneVar, me2.c(), continuationImpl);
    }
}
