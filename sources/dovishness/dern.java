package dovishness;

import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: ImmutableList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Ldovishness/dern;", "E", "", "Ldovishness/saneness;", "", "fromIndex", "toIndex", "subList", "(II)Ldovishness/dern;", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface dern<E> extends List<E>, saneness<E>, unready.attabal {

    /* JADX INFO: compiled from: ImmutableList.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ldovishness/dern$attabal;", "E", "Ldovishness/dern;", "Lkotlin/collections/wireman;", "source", "", "fromIndex", "toIndex", "<init>", "(Ldovishness/dern;II)V", "index", "get", "(I)Ljava/lang/Object;", "subList", "(II)Ldovishness/dern;", "kowloon", "Ldovishness/dern;", "arytenoidectomy", "I", "monoploid", "polloi", "_size", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal<E> extends p002kotlin.collections.wireman<E> implements dern<E> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final int fromIndex;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final dern<E> source;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final int toIndex;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public int _size;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(dern<? extends E> dernVar, int i, int i2) {
            this.source = dernVar;
            this.fromIndex = i;
            this.toIndex = i2;
            cord.wireman.dern(i, i2, dernVar.size());
            this._size = i2 - i;
        }

        @Override // p002kotlin.collections.wireman, java.util.List
        public E get(int index) {
            cord.wireman.attabal(index, this._size);
            return this.source.get(this.fromIndex + index);
        }

        @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness
        /* JADX INFO: renamed from: getSize, reason: from getter */
        public int get_size() {
            return this._size;
        }

        @Override // p002kotlin.collections.wireman, java.util.List, dovishness.dern
        public dern<E> subList(int fromIndex, int toIndex) {
            cord.wireman.dern(fromIndex, toIndex, this._size);
            dern<E> dernVar = this.source;
            int i = this.fromIndex;
            return new attabal(dernVar, fromIndex + i, i + toIndex);
        }
    }

    @Override // java.util.List
    default dern<E> subList(int fromIndex, int toIndex) {
        return new attabal(this, fromIndex, toIndex);
    }
}
