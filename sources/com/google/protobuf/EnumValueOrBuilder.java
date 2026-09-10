package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface EnumValueOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();
}
