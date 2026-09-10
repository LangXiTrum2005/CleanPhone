package bristol;

import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, d2 = {"Lbristol/beachfront;", "", "attabal", "(Lbristol/beachfront;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(Lbristol/beachfront;)V", "elementDescriptors", "", "saneness", "getElementNames$annotations", "elementNames", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"bristol/cutely$attabal", "", "Lbristol/beachfront;", "", "hasNext", "()Z", "saneness", "()Lbristol/beachfront;", "", "kowloon", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Iterator<beachfront>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ beachfront f15146arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public int elementsLeft;

        public attabal(beachfront beachfrontVar) {
            this.f15146arytenoidectomy = beachfrontVar;
            this.elementsLeft = beachfrontVar.wireman();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public beachfront next() {
            beachfront beachfrontVar = this.f15146arytenoidectomy;
            int iWireman = beachfrontVar.wireman();
            int i = this.elementsLeft;
            this.elementsLeft = i - 1;
            return beachfrontVar.competently(iWireman - i);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"bristol/cutely$dern", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class dern implements Iterable<beachfront>, unready.attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ beachfront f15148kowloon;

        public dern(beachfront beachfrontVar) {
            this.f15148kowloon = beachfrontVar;
        }

        @Override // java.lang.Iterable
        public Iterator<beachfront> iterator() {
            return new attabal(this.f15148kowloon);
        }
    }

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"bristol/cutely$saneness", "", "", "", "hasNext", "()Z", "saneness", "()Ljava/lang/String;", "", "kowloon", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness implements Iterator<String>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ beachfront f15149arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public int elementsLeft;

        public saneness(beachfront beachfrontVar) {
            this.f15149arytenoidectomy = beachfrontVar;
            this.elementsLeft = beachfrontVar.wireman();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public String next() {
            beachfront beachfrontVar = this.f15149arytenoidectomy;
            int iWireman = beachfrontVar.wireman();
            int i = this.elementsLeft;
            this.elementsLeft = i - 1;
            return beachfrontVar.marial(iWireman - i);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"bristol/cutely$wireman", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class wireman implements Iterable<String>, unready.attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ beachfront f15151kowloon;

        public wireman(beachfront beachfrontVar) {
            this.f15151kowloon = beachfrontVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new saneness(this.f15151kowloon);
        }
    }

    public static final Iterable<beachfront> attabal(beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        return new dern(beachfrontVar);
    }

    public static final Iterable<String> saneness(beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        return new wireman(beachfrontVar);
    }
}
