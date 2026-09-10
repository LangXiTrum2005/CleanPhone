package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z70;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class V {
    private Z70 fields;
    private boolean hasLazyField;
    private boolean hasNestedBuilders;
    private boolean isMutable;

    public /* synthetic */ V(U u) {
        this();
    }

    private W buildImpl(boolean z) {
        if (this.fields.isEmpty()) {
            return W.emptySet();
        }
        this.isMutable = false;
        Z70 z70CloneAllFieldsMap = this.fields;
        if (this.hasNestedBuilders) {
            z70CloneAllFieldsMap = W.cloneAllFieldsMap(z70CloneAllFieldsMap, false);
            replaceBuilders(z70CloneAllFieldsMap, z);
        }
        W w = new W(z70CloneAllFieldsMap, null);
        w.hasLazyField = this.hasLazyField;
        return w;
    }

    private void ensureIsMutable() {
        if (this.isMutable) {
            return;
        }
        this.fields = W.cloneAllFieldsMap(this.fields, true);
        this.isMutable = true;
    }

    public static <T extends FieldSet$FieldDescriptorLite<T>> V fromFieldSet(W w) {
        V v = new V(W.cloneAllFieldsMap(w.fields, true));
        v.hasLazyField = w.hasLazyField;
        return v;
    }

    private void mergeFromField(Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> entry) {
        FieldSet$FieldDescriptorLite<Object> key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (key.isRepeated()) {
            List arrayList = (List) getFieldAllowBuilders(key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.fields.put((Comparable<Object>) key, (Object) arrayList);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(W.cloneIfMutable(it.next()));
            }
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.fields.put((Comparable<Object>) key, W.cloneIfMutable(value));
            return;
        }
        Object fieldAllowBuilders = getFieldAllowBuilders(key);
        if (fieldAllowBuilders == null) {
            this.fields.put((Comparable<Object>) key, W.cloneIfMutable(value));
        } else if (fieldAllowBuilders instanceof MessageLite.Builder) {
            key.internalMergeFrom((MessageLite.Builder) fieldAllowBuilders, (MessageLite) value);
        } else {
            this.fields.put((Comparable<Object>) key, (Object) key.internalMergeFrom(((MessageLite) fieldAllowBuilders).toBuilder(), (MessageLite) value).build());
        }
    }

    private static Object replaceBuilder(Object obj, boolean z) {
        if (!(obj instanceof MessageLite.Builder)) {
            return obj;
        }
        MessageLite.Builder builder = (MessageLite.Builder) obj;
        return z ? builder.buildPartial() : builder.build();
    }

    private static <T extends FieldSet$FieldDescriptorLite<T>> void replaceBuilders(Z70 z70, boolean z) {
        for (int i = 0; i < z70.getNumArrayEntries(); i++) {
            replaceBuilders(z70.getArrayEntryAt(i), z);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = z70.getOverflowEntries().iterator();
        while (it.hasNext()) {
            replaceBuilders(it.next(), z);
        }
    }

    private void verifyType(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, Object obj) {
        if (W.isValidType(fieldSet$FieldDescriptorLite.getLiteType(), obj)) {
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteType().getJavaType() != WireFormat.JavaType.MESSAGE || !(obj instanceof MessageLite.Builder)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldSet$FieldDescriptorLite.getNumber()), fieldSet$FieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public void addRepeatedField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, Object obj) {
        List arrayList;
        ensureIsMutable();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
        verifyType(fieldSet$FieldDescriptorLite, obj);
        Object fieldAllowBuilders = getFieldAllowBuilders(fieldSet$FieldDescriptorLite);
        if (fieldAllowBuilders == null) {
            arrayList = new ArrayList();
            this.fields.put((Comparable<Object>) fieldSet$FieldDescriptorLite, (Object) arrayList);
        } else {
            arrayList = (List) fieldAllowBuilders;
        }
        arrayList.add(obj);
    }

    public W build() {
        return buildImpl(false);
    }

    public W buildPartial() {
        return buildImpl(true);
    }

    public void clearField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        ensureIsMutable();
        this.fields.remove(fieldSet$FieldDescriptorLite);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Map<FieldSet$FieldDescriptorLite<Object>, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        Z70 z70CloneAllFieldsMap = W.cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            z70CloneAllFieldsMap.makeImmutable();
        } else {
            replaceBuilders(z70CloneAllFieldsMap, true);
        }
        return z70CloneAllFieldsMap;
    }

    public Object getField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        return replaceBuilders(fieldSet$FieldDescriptorLite, getFieldAllowBuilders(fieldSet$FieldDescriptorLite), true);
    }

    public Object getFieldAllowBuilders(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        Object obj = this.fields.get(fieldSet$FieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public Object getRepeatedField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, int i) {
        if (this.hasNestedBuilders) {
            ensureIsMutable();
        }
        return replaceBuilder(getRepeatedFieldAllowBuilders(fieldSet$FieldDescriptorLite, i), true);
    }

    public Object getRepeatedFieldAllowBuilders(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, int i) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object fieldAllowBuilders = getFieldAllowBuilders(fieldSet$FieldDescriptorLite);
        if (fieldAllowBuilders != null) {
            return ((List) fieldAllowBuilders).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
        }
        Object fieldAllowBuilders = getFieldAllowBuilders(fieldSet$FieldDescriptorLite);
        if (fieldAllowBuilders == null) {
            return 0;
        }
        return ((List) fieldAllowBuilders).size();
    }

    public boolean hasField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(fieldSet$FieldDescriptorLite) != null;
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!W.isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!W.isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFrom(W w) {
        ensureIsMutable();
        for (int i = 0; i < w.fields.getNumArrayEntries(); i++) {
            mergeFromField(w.fields.getArrayEntryAt(i));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = w.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, Object obj) {
        ensureIsMutable();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            verifyType(fieldSet$FieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList((List) obj);
            for (Object obj2 : arrayList) {
                verifyType(fieldSet$FieldDescriptorLite, obj2);
                this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof MessageLite.Builder);
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
        this.fields.put((Comparable<Object>) fieldSet$FieldDescriptorLite, obj);
    }

    public void setRepeatedField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, int i, Object obj) {
        ensureIsMutable();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof MessageLite.Builder);
        Object fieldAllowBuilders = getFieldAllowBuilders(fieldSet$FieldDescriptorLite);
        if (fieldAllowBuilders == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(fieldSet$FieldDescriptorLite, obj);
        ((List) fieldAllowBuilders).set(i, obj);
    }

    private V() {
        this(Z70.newFieldMap(16));
    }

    private V(Z70 z70) {
        this.fields = z70;
        this.isMutable = true;
    }

    private static <T extends FieldSet$FieldDescriptorLite<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean z) {
        entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z));
    }

    private static <T extends FieldSet$FieldDescriptorLite<T>> Object replaceBuilders(T t, Object obj, boolean z) {
        if (obj == null || t.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return obj;
        }
        if (t.isRepeated()) {
            if (obj instanceof List) {
                List arrayList = (List) obj;
                for (int i = 0; i < arrayList.size(); i++) {
                    Object obj2 = arrayList.get(i);
                    Object objReplaceBuilder = replaceBuilder(obj2, z);
                    if (objReplaceBuilder != obj2) {
                        if (arrayList == obj) {
                            arrayList = new ArrayList(arrayList);
                        }
                        arrayList.set(i, objReplaceBuilder);
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
        }
        return replaceBuilder(obj, z);
    }
}
