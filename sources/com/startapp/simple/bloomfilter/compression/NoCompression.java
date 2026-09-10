package com.startapp.simple.bloomfilter.compression;

/* JADX INFO: loaded from: classes6.dex */
public class NoCompression implements TokenCompression {
    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String compress(String str) {
        return str;
    }

    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String decompress(String str) {
        return str;
    }
}
