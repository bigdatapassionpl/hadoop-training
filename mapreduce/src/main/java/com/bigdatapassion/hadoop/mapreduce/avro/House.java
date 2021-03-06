/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.bigdatapassion.hadoop.mapreduce.avro;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface House {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"House\",\"namespace\":\"com.bigdatapassion.hadoop.mapreduce.avro\",\"types\":[{\"type\":\"record\",\"name\":\"HouseKey\",\"fields\":[{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"hood\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"HouseValue\",\"fields\":[{\"name\":\"count\",\"type\":\"long\"},{\"name\":\"landArea\",\"type\":\"int\"},{\"name\":\"grossArea\",\"type\":\"int\"},{\"name\":\"yearBuilt\",\"type\":\"int\"},{\"name\":\"salePrice\",\"type\":\"int\"}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends House {
    public static final org.apache.avro.Protocol PROTOCOL = com.bigdatapassion.hadoop.mapreduce.avro.House.PROTOCOL;
  }
}