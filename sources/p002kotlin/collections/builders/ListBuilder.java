package p002kotlin.collections.builders;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.A5;
import com.ironsource.C3414a2;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.collections.graveside;
import p002kotlin.collections.impromptu;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import unready.wireman;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003b$cB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u001eJ5\u0010,\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u00101J\u0018\u00103\u001a\u00028\u00002\u0006\u00102\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b3\u0010'J \u00104\u001a\u00028\u00002\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u00107J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0096\u0002¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0016¢\u0006\u0004\b=\u0010>J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010?J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010@\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010!J\u001d\u0010B\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bB\u0010CJ%\u0010B\u001a\u00020\u00192\u0006\u00102\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bB\u0010DJ\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u0011J\u0017\u0010F\u001a\u00028\u00002\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010'J\u0017\u0010G\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\bG\u0010AJ\u001d\u0010H\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bH\u0010CJ\u001d\u0010I\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bI\u0010CJ%\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010O\"\u0004\b\u0001\u0010N2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0OH\u0016¢\u0006\u0004\bQ\u0010SJ\u001a\u0010T\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\bT\u0010AJ\u000f\u0010U\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010V¨\u0006d"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/impromptu;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "", "cutely", "()V", "marial", A5.q, "impromptu", "minCapacity", "competently", "", C3414a2.d, "", "beachfront", "(Ljava/util/List;)Z", "i", "taiyuan", "(II)V", "element", "wireman", "(ILjava/lang/Object;)V", "", "elements", "saneness", "(ILjava/util/Collection;I)V", "impassible", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "triweekly", "retain", "kowloon", "(IILjava/util/Collection;Z)I", "build", "()Ljava/util/List;", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "backing", "[Ljava/lang/Object;", "length", "I", "isReadOnly", "Z", "getSize", "size", "attabal", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListBuilder<E> extends impromptu<E> implements List<E>, RandomAccess, Serializable, wireman {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final ListBuilder f29309arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    private static final attabal f29310kowloon = new attabal(null);
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001fBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u001b\u0010!\u001a\u00020 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00028\u0001H\u0002¢\u0006\u0004\b%\u0010&J-\u0010*\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00028\u00012\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b0\u00101J5\u00103\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'2\u0006\u00102\u001a\u00020 H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020 H\u0016¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u00028\u00012\u0006\u00107\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b8\u0010-J \u00109\u001a\u00028\u00012\u0006\u00107\u001a\u00020\n2\u0006\u0010$\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\n2\u0006\u0010$\u001a\u00028\u0001H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010$\u001a\u00028\u0001H\u0016¢\u0006\u0004\b=\u0010<J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010>H\u0096\u0002¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00010A2\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010DJ\u0017\u0010E\u001a\u00020 2\u0006\u0010$\u001a\u00028\u0001H\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010E\u001a\u00020\u00172\u0006\u00107\u001a\u00020\n2\u0006\u0010$\u001a\u00028\u0001H\u0016¢\u0006\u0004\bE\u0010&J\u001d\u0010G\u001a\u00020 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'H\u0016¢\u0006\u0004\bG\u0010HJ%\u0010G\u001a\u00020 2\u0006\u00107\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'H\u0016¢\u0006\u0004\bG\u0010IJ\u000f\u0010J\u001a\u00020\u0017H\u0016¢\u0006\u0004\bJ\u0010\u001bJ\u0017\u0010K\u001a\u00028\u00012\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010-J\u0017\u0010L\u001a\u00020 2\u0006\u0010$\u001a\u00028\u0001H\u0016¢\u0006\u0004\bL\u0010FJ\u001d\u0010M\u001a\u00020 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'H\u0016¢\u0006\u0004\bM\u0010HJ\u001d\u0010N\u001a\u00020 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'H\u0016¢\u0006\u0004\bN\u0010HJ%\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010RJ)\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u0010S2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bH\u0016¢\u0006\u0004\bU\u0010WJ\u001a\u0010X\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\bX\u0010FJ\u000f\u0010Y\u001a\u00020\nH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b\\\u0010]R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010_R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010_R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010`R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010aR\u0014\u0010c\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u00106R\u0014\u0010e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010Z¨\u0006g"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/impromptu;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "taiyuan", "()V", "marial", "beachfront", "", C3414a2.d, "", "competently", "(Ljava/util/List;)Z", "i", "element", "wireman", "(ILjava/lang/Object;)V", "", "elements", A5.q, "saneness", "(ILjava/util/Collection;I)V", "cutely", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "impassible", "(II)V", "retain", "triweekly", "(IILjava/util/Collection;Z)I", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[Ljava/lang/Object;", "I", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "impromptu", "isReadOnly", "getSize", "size", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BuilderSubList<E> extends impromptu<E> implements List<E>, RandomAccess, Serializable, wireman {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        /* JADX INFO: compiled from: ListBuilder.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$attabal;", "E", "", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "list", "", "index", "<init>", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "", "saneness", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "kowloon", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "arytenoidectomy", "I", "monoploid", "lastIndex", "polloi", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class attabal<E> implements ListIterator<E>, unready.attabal {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
            public int index;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
            public final BuilderSubList<E> list;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
            public int lastIndex;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
            public int expectedModCount;

            public attabal(BuilderSubList<E> list, int i) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
                this.index = i;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            private final void saneness() {
                if (((AbstractList) ((BuilderSubList) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                saneness();
                BuilderSubList<E> builderSubList = this.list;
                int i = this.index;
                this.index = i + 1;
                builderSubList.add(i, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((BuilderSubList) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                saneness();
                if (this.index >= ((BuilderSubList) this.list).length) {
                    throw new NoSuchElementException();
                }
                int i = this.index;
                this.index = i + 1;
                this.lastIndex = i;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                saneness();
                int i = this.index;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.index = i2;
                this.lastIndex = i2;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                saneness();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.removeAt(i);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                saneness();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i, element);
            }
        }

        public BuilderSubList(E[] backing, int i, int i2, BuilderSubList<E> builderSubList, ListBuilder<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.backing = backing;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void marial() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final void taiyuan() {
            ((AbstractList) this).modCount++;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (impromptu()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            beachfront();
            marial();
            wireman(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            beachfront();
            marial();
            int size = elements.size();
            saneness(this.offset + this.length, elements, size);
            return size > 0;
        }

        public final void beachfront() {
            if (impromptu()) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            beachfront();
            marial();
            impassible(this.offset, this.length);
        }

        public final boolean competently(List<?> other) {
            return spring.saneness.impromptu(this.backing, this.offset, this.length, other);
        }

        public final E cutely(int i) {
            taiyuan();
            BuilderSubList<E> builderSubList = this.parent;
            E eCutely = builderSubList != null ? builderSubList.cutely(i) : (E) this.root.impassible(i);
            this.length--;
            return eCutely;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            marial();
            if (other != this) {
                return (other instanceof List) && competently((List) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            marial();
            p002kotlin.collections.wireman.INSTANCE.saneness(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // p002kotlin.collections.impromptu
        public int getSize() {
            marial();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            marial();
            return spring.saneness.taiyuan(this.backing, this.offset, this.length);
        }

        public final void impassible(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                taiyuan();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.impassible(rangeOffset, rangeLength);
            } else {
                this.root.triweekly(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        public final boolean impromptu() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            marial();
            for (int i = 0; i < this.length; i++) {
                if (Intrinsics.wireman(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            marial();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            marial();
            for (int i = this.length - 1; i >= 0; i--) {
                if (Intrinsics.wireman(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            beachfront();
            marial();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            beachfront();
            marial();
            return triweekly(this.offset, this.length, elements, false) > 0;
        }

        @Override // p002kotlin.collections.impromptu
        public E removeAt(int index) {
            beachfront();
            marial();
            p002kotlin.collections.wireman.INSTANCE.saneness(index, this.length);
            return cutely(this.offset + index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            beachfront();
            marial();
            return triweekly(this.offset, this.length, elements, true) > 0;
        }

        public final void saneness(int i, Collection<? extends E> elements, int n) {
            taiyuan();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.saneness(i, elements, n);
            } else {
                this.root.saneness(i, elements, n);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += n;
        }

        @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            beachfront();
            marial();
            p002kotlin.collections.wireman.INSTANCE.saneness(index, this.length);
            E[] eArr = this.backing;
            int i = this.offset;
            E e = eArr[i + index];
            eArr[i + index] = element;
            return e;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            p002kotlin.collections.wireman.INSTANCE.wireman(fromIndex, toIndex, this.length);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            marial();
            int length = array.length;
            int i = this.length;
            if (length >= i) {
                E[] eArr = this.backing;
                int i2 = this.offset;
                arytenoidectomy.taiyuan(eArr, array, 0, i2, i + i2);
                return (T[]) graveside.beachfront(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i3 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i3, i + i3, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            marial();
            return spring.saneness.cutely(this.backing, this.offset, this.length, this);
        }

        public final int triweekly(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            BuilderSubList<E> builderSubList = this.parent;
            int iTriweekly = builderSubList != null ? builderSubList.triweekly(rangeOffset, rangeLength, elements, retain) : this.root.kowloon(rangeOffset, rangeLength, elements, retain);
            if (iTriweekly > 0) {
                taiyuan();
            }
            this.length -= iTriweekly;
            return iTriweekly;
        }

        public final void wireman(int i, E element) {
            taiyuan();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.wireman(i, element);
            } else {
                this.root.wireman(i, element);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            marial();
            p002kotlin.collections.wireman.INSTANCE.dern(index, this.length);
            return new attabal(this, index);
        }

        @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            beachfront();
            marial();
            p002kotlin.collections.wireman.INSTANCE.dern(index, this.length);
            wireman(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            beachfront();
            marial();
            p002kotlin.collections.wireman.INSTANCE.dern(index, this.length);
            int size = elements.size();
            saneness(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            marial();
            E[] eArr = this.backing;
            int i = this.offset;
            return arytenoidectomy.arytenoidectomy(eArr, i, this.length + i);
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/ListBuilder$attabal;", "", "<init>", "()V", "Lkotlin/collections/builders/ListBuilder;", "", "Empty", "Lkotlin/collections/builders/ListBuilder;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lkotlin/collections/builders/ListBuilder$saneness;", "E", "", "Lkotlin/collections/builders/ListBuilder;", "list", "", "index", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "", "saneness", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "kowloon", "Lkotlin/collections/builders/ListBuilder;", "arytenoidectomy", "I", "monoploid", "lastIndex", "polloi", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness<E> implements ListIterator<E>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final ListBuilder<E> list;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public int lastIndex;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public int expectedModCount;

        public saneness(ListBuilder<E> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void saneness() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            saneness();
            ListBuilder<E> listBuilder = this.list;
            int i = this.index;
            this.index = i + 1;
            listBuilder.add(i, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            saneness();
            if (this.index >= ((ListBuilder) this.list).length) {
                throw new NoSuchElementException();
            }
            int i = this.index;
            this.index = i + 1;
            this.lastIndex = i;
            return (E) ((ListBuilder) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            saneness();
            int i = this.index;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.index = i2;
            this.lastIndex = i2;
            return (E) ((ListBuilder) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            saneness();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.removeAt(i);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            saneness();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i, element);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f29309arytenoidectomy = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    private final boolean beachfront(List<?> other) {
        return spring.saneness.impromptu(this.backing, 0, this.length, other);
    }

    private final void cutely() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E impassible(int i) {
        cutely();
        E[] eArr = this.backing;
        E e = eArr[i];
        arytenoidectomy.taiyuan(eArr, eArr, i, i + 1, this.length);
        spring.saneness.beachfront(this.backing, this.length - 1);
        this.length--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int kowloon(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i = 0;
        int i2 = 0;
        while (i < rangeLength) {
            int i3 = rangeOffset + i;
            if (elements.contains(this.backing[i3]) == retain) {
                E[] eArr = this.backing;
                i++;
                eArr[i2 + rangeOffset] = eArr[i3];
                i2++;
            } else {
                i++;
            }
        }
        int i4 = rangeLength - i2;
        E[] eArr2 = this.backing;
        arytenoidectomy.taiyuan(eArr2, eArr2, rangeOffset + i2, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i5 = this.length;
        spring.saneness.competently(eArr3, i5 - i4, i5);
        if (i4 > 0) {
            cutely();
        }
        this.length -= i4;
        return i4;
    }

    private final void marial() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saneness(int i, Collection<? extends E> elements, int n) {
        cutely();
        taiyuan(i, n);
        Iterator<? extends E> it = elements.iterator();
        for (int i2 = 0; i2 < n; i2++) {
            this.backing[i + i2] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triweekly(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            cutely();
        }
        E[] eArr = this.backing;
        arytenoidectomy.taiyuan(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i = this.length;
        spring.saneness.competently(eArr2, i - rangeLength, i);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wireman(int i, E element) {
        cutely();
        taiyuan(i, 1);
        this.backing[i] = element;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        marial();
        wireman(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        marial();
        int size = elements.size();
        saneness(this.length, elements, size);
        return size > 0;
    }

    public final List<E> build() {
        marial();
        this.isReadOnly = true;
        return this.length > 0 ? this : f29309arytenoidectomy;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        marial();
        triweekly(0, this.length);
    }

    public final void competently(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) spring.saneness.marial(this.backing, p002kotlin.collections.wireman.INSTANCE.marial(eArr.length, minCapacity));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && beachfront((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        p002kotlin.collections.wireman.INSTANCE.saneness(index, this.length);
        return this.backing[index];
    }

    @Override // p002kotlin.collections.impromptu
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return spring.saneness.taiyuan(this.backing, 0, this.length);
    }

    public final void impromptu(int n) {
        competently(this.length + n);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.wireman(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.wireman(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        marial();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        marial();
        return kowloon(0, this.length, elements, false) > 0;
    }

    @Override // p002kotlin.collections.impromptu
    public E removeAt(int index) {
        marial();
        p002kotlin.collections.wireman.INSTANCE.saneness(index, this.length);
        return impassible(index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        marial();
        return kowloon(0, this.length, elements, true) > 0;
    }

    @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        marial();
        p002kotlin.collections.wireman.INSTANCE.saneness(index, this.length);
        E[] eArr = this.backing;
        E e = eArr[index];
        eArr[index] = element;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        p002kotlin.collections.wireman.INSTANCE.wireman(fromIndex, toIndex, this.length);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    public final void taiyuan(int i, int n) {
        impromptu(n);
        E[] eArr = this.backing;
        arytenoidectomy.taiyuan(eArr, eArr, i + n, i, this.length);
        this.length += n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.length;
        if (length >= i) {
            arytenoidectomy.taiyuan(this.backing, array, 0, 0, i);
            return (T[]) graveside.beachfront(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i, array.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return spring.saneness.cutely(this.backing, 0, this.length, this);
    }

    public ListBuilder(int i) {
        this.backing = (E[]) spring.saneness.wireman(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        p002kotlin.collections.wireman.INSTANCE.dern(index, this.length);
        return new saneness(this, index);
    }

    @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        marial();
        p002kotlin.collections.wireman.INSTANCE.dern(index, this.length);
        wireman(index, element);
    }

    public /* synthetic */ ListBuilder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        marial();
        p002kotlin.collections.wireman.INSTANCE.dern(index, this.length);
        int size = elements.size();
        saneness(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return arytenoidectomy.arytenoidectomy(this.backing, 0, this.length);
    }
}
