package dg;

import android.media.MediaFormat;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import wf.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c extends k implements jk.e {
    public final Object a(final vf.c cVar, Integer num, Integer num2, Object obj, Object obj2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        vf.b p10 = (vf.b) obj;
        final MediaFormat p11 = (MediaFormat) obj2;
        n.f(p10, "p3");
        n.f(p11, "p4");
        d dVar = (d) this.receiver;
        String str = null;
        dVar.f38860f.b(2, null, "createPipeline(" + cVar + ", " + iIntValue + ", " + p10 + "), format=" + p11);
        final h hVarB = dVar.f38863i.b(cVar, iIntValue);
        List listL = dVar.f38855a.l(cVar);
        jg.b bVar = (jg.b) listL.get(iIntValue);
        a aVar = new a(0, dVar, cVar);
        n.f(bVar, "<this>");
        final eg.b bVar2 = new eg.b(bVar, aVar);
        ig.a aVar2 = dVar.f38856b;
        b bVar3 = new b(iIntValue, listL);
        n.f(aVar2, "<this>");
        final g9.k kVar = new g9.k(aVar2, bVar3);
        int iOrdinal = p10.ordinal();
        if (iOrdinal == 0) {
            return cg.b.c("Empty", null, new defpackage.c(1));
        }
        if (iOrdinal == 1) {
            return cg.b.c("Empty", null, new defpackage.c(1));
        }
        if (iOrdinal == 2) {
            return cg.b.c("PassThrough" + cVar, null, new jk.a() { // from class: cg.h
                @Override // jk.a
                public final Object invoke() {
                    eg.b bVar4 = bVar2;
                    vf.c cVar2 = cVar;
                    d dVarC = a.a.C(new ag.b(bVar4, cVar2), new ag.e(cVar2, hVarB));
                    MediaFormat mediaFormatD = bVar4.f40039a.d(cVar2);
                    kotlin.jvm.internal.n.c(mediaFormatD);
                    return dVarC.a(new ag.a(mediaFormatD)).a(new ag.f(kVar, cVar2));
                }
            });
        }
        if (iOrdinal != 3) {
            throw new aa.b((byte) 0, 20);
        }
        if (iIntValue2 > 1) {
            str = (iIntValue + 1) + "/" + iIntValue2;
        }
        String str2 = str;
        final fc.f codecs = dVar.f38864j;
        final lg.a audioStretcher = dVar.f38858d;
        final gg.a audioResampler = dVar.f38859e;
        n.f(codecs, "codecs");
        n.f(audioStretcher, "audioStretcher");
        n.f(audioResampler, "audioResampler");
        int iOrdinal2 = cVar.ordinal();
        if (iOrdinal2 == 0) {
            return cg.b.c("Audio", str2, new jk.a() { // from class: cg.g
                @Override // jk.a
                public final Object invoke() {
                    lg.a audioStretcher2 = audioStretcher;
                    kotlin.jvm.internal.n.f(audioStretcher2, "$audioStretcher");
                    gg.a audioResampler2 = audioResampler;
                    kotlin.jvm.internal.n.f(audioResampler2, "$audioResampler");
                    MediaFormat format = p11;
                    kotlin.jvm.internal.n.f(format, "$format");
                    fc.f codecs2 = codecs;
                    kotlin.jvm.internal.n.f(codecs2, "$codecs");
                    eg.b bVar4 = bVar2;
                    vf.c cVar2 = vf.c.AUDIO;
                    ag.b bVar5 = new ag.b(bVar4, cVar2);
                    MediaFormat mediaFormatD = bVar4.f40039a.d(cVar2);
                    kotlin.jvm.internal.n.c(mediaFormatD);
                    return a.a.C(bVar5, new zf.b(mediaFormatD)).a(new zf.e(cVar2, hVarB)).a(new xf.b(audioStretcher2, audioResampler2, format)).a(new zf.g(codecs2, cVar2)).a(new ag.f(kVar, cVar2));
                }
            });
        }
        if (iOrdinal2 == 1) {
            return cg.b.c("Video", str2, new jk.a() { // from class: cg.i
                @Override // jk.a
                public final Object invoke() {
                    MediaFormat format = p11;
                    kotlin.jvm.internal.n.f(format, "$format");
                    fc.f codecs2 = codecs;
                    kotlin.jvm.internal.n.f(codecs2, "$codecs");
                    eg.b bVar4 = bVar2;
                    vf.c cVar2 = vf.c.VIDEO;
                    ag.b bVar5 = new ag.b(bVar4, cVar2);
                    jg.b bVar6 = bVar4.f40039a;
                    MediaFormat mediaFormatD = bVar6.d(cVar2);
                    kotlin.jvm.internal.n.c(mediaFormatD);
                    return a.a.C(bVar5, new zf.b(mediaFormatD)).a(new zf.e(cVar2, hVarB)).a(new fg.e(format, bVar6.getOrientation())).a(new fg.d()).a(new zf.g(codecs2, cVar2)).a(new ag.f(kVar, cVar2));
                }
            });
        }
        throw new aa.b((byte) 0, 20);
    }
}
