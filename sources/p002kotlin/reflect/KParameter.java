package p002kotlin.reflect;

import kurbash.arytenoidectomy;
import kurbash.saneness;
import p002kotlin.Metadata;
import pussyfooter.attabal;

/* JADX INFO: compiled from: KParameter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u001aR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkurbash/saneness;", "", "getIndex", "()I", "index", "", "getName", "()Ljava/lang/String;", "name", "Lkurbash/arytenoidectomy;", "getType", "()Lkurbash/arytenoidectomy;", "type", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "kind", "", "formularize", "()Z", "isOptional", "saneness", "isVararg$annotations", "()V", "isVararg", "Kind", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KParameter extends saneness {

    /* JADX INFO: compiled from: KParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "CONTEXT", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Kind {
        INSTANCE,
        CONTEXT,
        EXTENSION_RECEIVER,
        VALUE;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ attabal f29418arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());

        public static attabal<Kind> getEntries() {
            return f29418arytenoidectomy;
        }
    }

    boolean formularize();

    int getIndex();

    Kind getKind();

    String getName();

    arytenoidectomy getType();

    boolean saneness();
}
