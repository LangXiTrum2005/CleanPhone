package paddywack;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import okhttp3.adultoid;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.preprohormone;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpaddywack/saneness;", "Lokhttp3/adultoid;", "", "forWebSocket", "<init>", "(Z)V", "Lokhttp3/adultoid$attabal;", "chain", "Lokhttp3/cuirassed;", "intercept", "(Lokhttp3/adultoid$attabal;)Lokhttp3/cuirassed;", "", "code", "attabal", "(I)Z", "kowloon", "Z", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class saneness implements adultoid {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final boolean forWebSocket;

    public saneness(boolean z) {
        this.forWebSocket = z;
    }

    public final boolean attabal(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[Catch: IOException -> 0x006a, TRY_LEAVE, TryCatch #0 {IOException -> 0x006a, blocks: (B:17:0x0055, B:19:0x005b, B:30:0x0093, B:32:0x0099, B:22:0x006c, B:23:0x007b, B:25:0x0088), top: B:84:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, okhttp3.cuirassed$attabal] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [okhttp3.cuirassed$attabal] */
    @Override // okhttp3.adultoid
    public cuirassed intercept(adultoid.attabal chain) throws IllegalAccessException, IOException, InvocationTargetException {
        boolean z;
        ?? r9;
        ?? Monoploid;
        cuirassed.attabal attabalVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        competently competentlyVar = (competently) chain;
        okhttp3.internal.connection.dern exchange = competentlyVar.getExchange();
        Intrinsics.beachfront(exchange);
        preprohormone preprohormoneVar = competentlyVar.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String();
        cord body = preprohormoneVar.getBody();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = null;
        try {
            exchange.adultoid(preprohormoneVar);
            ?? Saneness = beachfront.saneness(preprohormoneVar.getMethod());
            try {
                if (Saneness == 0 || body == null) {
                    exchange.kowloon();
                    z = true;
                    Saneness = 0;
                } else {
                    if (dovishness.stratoscope("100-continue", preprohormoneVar.wireman("Expect"), true)) {
                        exchange.beachfront();
                        cuirassed.attabal attabalVarMonoploid = exchange.monoploid(true);
                        try {
                            exchange.molybdenite();
                            z = false;
                            attabalVar = attabalVarMonoploid;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            r9 = attabalVarMonoploid;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                Monoploid = r9;
                                throw e;
                            }
                        }
                    } else {
                        z = true;
                        attabalVar = null;
                    }
                    if (attabalVar != null) {
                        exchange.kowloon();
                        if (!exchange.getConnection().dovishness()) {
                            Saneness = attabalVar;
                            exchange.triweekly();
                            Saneness = attabalVar;
                        }
                    } else if (body.isDuplex()) {
                        exchange.beachfront();
                        body.writeTo(duvetyn.adultoid.dern(exchange.dern(preprohormoneVar, true)));
                    } else {
                        duvetyn.marial marialVarDern = duvetyn.adultoid.dern(exchange.dern(preprohormoneVar, false));
                        body.writeTo(marialVarDern);
                        marialVarDern.close();
                    }
                }
                if (body != null) {
                    Saneness = attabalVar;
                    if (!body.isDuplex()) {
                        Saneness = attabalVar;
                        Saneness = attabalVar;
                        Saneness = attabalVar;
                        exchange.marial();
                    }
                } else {
                    Saneness = attabalVar;
                    Saneness = attabalVar;
                    Saneness = attabalVar;
                    exchange.marial();
                }
                Saneness = attabalVar;
                e = null;
                Monoploid = Saneness;
            } catch (IOException e2) {
                e = e2;
                r9 = Saneness;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            r9 = 0;
        }
        if (Monoploid == 0) {
            try {
                Monoploid = exchange.monoploid(false);
                Intrinsics.beachfront(Monoploid);
                if (z) {
                    exchange.molybdenite();
                    z = false;
                }
            } catch (IOException e4) {
                if (e == null) {
                    throw e4;
                }
                patroclinal.marial.attabal(e, e4);
                throw e;
            }
        }
        cuirassed cuirassedVarDern = Monoploid.molybdenite(preprohormoneVar).cutely(exchange.getConnection().getHandshake()).graveside(jCurrentTimeMillis).polloi(System.currentTimeMillis()).dern();
        int code = cuirassedVarDern.getCode();
        if (attabal(code)) {
            cuirassed.attabal attabalVarMonoploid2 = exchange.monoploid(false);
            Intrinsics.beachfront(attabalVarMonoploid2);
            if (z) {
                exchange.molybdenite();
            }
            cuirassedVarDern = attabalVarMonoploid2.molybdenite(preprohormoneVar).cutely(exchange.getConnection().getHandshake()).graveside(jCurrentTimeMillis).polloi(System.currentTimeMillis()).dern();
            code = cuirassedVarDern.getCode();
        }
        exchange.polloi(cuirassedVarDern);
        cuirassed cuirassedVarDern2 = (this.forWebSocket && code == 101) ? cuirassedVarDern.polder().saneness(hereditist.wireman.f27720dern).dern() : cuirassedVarDern.polder().saneness(exchange.arytenoidectomy(cuirassedVarDern)).dern();
        if (dovishness.stratoscope("close", cuirassedVarDern2.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().wireman("Connection"), true) || dovishness.stratoscope("close", cuirassed.rotuma(cuirassedVarDern2, "Connection", null, 2, null), true)) {
            exchange.triweekly();
        }
        if (code == 204 || code == 205) {
            stratoscope body2 = cuirassedVarDern2.getBody();
            if ((body2 == null ? -1L : body2.getContentLength()) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(code);
                sb.append(" had non-zero Content-Length: ");
                stratoscope body3 = cuirassedVarDern2.getBody();
                if (body3 != null) {
                    lValueOf = Long.valueOf(body3.getContentLength());
                }
                sb.append(lValueOf);
                throw new ProtocolException(sb.toString());
            }
        }
        return cuirassedVarDern2;
    }
}
