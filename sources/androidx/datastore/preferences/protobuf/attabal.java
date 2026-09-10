package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.attabal;
import androidx.datastore.preferences.protobuf.attabal.AbstractC0068attabal;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal<MessageType extends attabal<MessageType, BuilderType>, BuilderType extends AbstractC0068attabal<MessageType, BuilderType>> implements saran {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0068attabal<MessageType extends attabal<MessageType, BuilderType>, BuilderType extends AbstractC0068attabal<MessageType, BuilderType>> implements saran.attabal {
        public static UninitializedMessageException competently(saran saranVar) {
            return new UninitializedMessageException(saranVar);
        }

        public static <T> void dern(Iterable<T> iterable, List<? super T> list) {
            gintrap.attabal(iterable);
            if (!(iterable instanceof stratoscope)) {
                if (iterable instanceof overspeculate) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    wireman(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((stratoscope) iterable).getUnderlyingElements();
            stratoscope stratoscopeVar = (stratoscope) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (stratoscopeVar.size() - size) + " is null.";
                    for (int size2 = stratoscopeVar.size() - 1; size2 >= size; size2--) {
                        stratoscopeVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    stratoscopeVar.starveling((ByteString) obj);
                } else if (obj instanceof byte[]) {
                    stratoscopeVar.starveling(ByteString.copyFrom((byte[]) obj));
                } else {
                    stratoscopeVar.add((String) obj);
                }
            }
        }

        public static <T> void wireman(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.saran.attabal
        /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
        public BuilderType saneness(saran saranVar) {
            if (getDefaultInstanceForType().getClass().isInstance(saranVar)) {
                return (BuilderType) marial((attabal) saranVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public abstract BuilderType marial(MessageType messagetype);
    }

    public static <T> void dern(Iterable<T> iterable, List<? super T> list) {
        AbstractC0068attabal.dern(iterable, list);
    }

    public final String beachfront(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException competently() {
        return new UninitializedMessageException(this);
    }

    public void impromptu(int i) {
        throw new UnsupportedOperationException();
    }

    public int marial(premeiotic premeioticVar) {
        int iWireman = wireman();
        if (iWireman != -1) {
            return iWireman;
        }
        int serializedSize = premeioticVar.getSerializedSize(this);
        impromptu(serializedSize);
        return serializedSize;
    }

    public void taiyuan(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamItchy = CodedOutputStream.itchy(outputStream, CodedOutputStream.merc(getSerializedSize()));
        attabal(codedOutputStreamItchy);
        codedOutputStreamItchy.timberyard();
    }

    @Override // androidx.datastore.preferences.protobuf.saran
    public ByteString toByteString() {
        try {
            ByteString.competently competentlyVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            attabal(competentlyVarNewCodedBuilder.saneness());
            return competentlyVarNewCodedBuilder.attabal();
        } catch (IOException e) {
            throw new RuntimeException(beachfront("ByteString"), e);
        }
    }

    public int wireman() {
        throw new UnsupportedOperationException();
    }
}
