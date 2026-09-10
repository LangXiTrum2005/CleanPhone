package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface FieldOrBuilder extends MessageLiteOrBuilder {
    Field.Cardinality getCardinality();

    int getCardinalityValue();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    String getJsonName();

    ByteString getJsonNameBytes();

    Field.Kind getKind();

    int getKindValue();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    ByteString getTypeUrlBytes();
}
