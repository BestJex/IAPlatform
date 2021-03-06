/**
 * Copyright 2017 Institute of Computing Technology, Chinese Academy of Sciences.
 * Licensed under the terms of the Apache 2.0 license.
 * Please see LICENSE file in the project root for terms
 */
package com.ue.dataAnalyze;



/**
 * Data feature description class for describe a dataset statics feature
 */
public class DataFeature {
	private double mean;     
	private double median; 
	private double min;
	private double max;
	private double standDeviation;
	private int uniqueValues;  //num of unique value
	private int missingValues;  // num of missing value
	private boolean numberic ;  // if data is numberic or String


	private  long readDatatime; //读取数据的时间
	private  long ParseDatatime; //解析数据的时间
	private  long statisicDatatime; //统计数据的时间





	public DataFeature(){};

	public DataFeature(double mean, double median, double min , double max, double standDeviation, int uniqueValues, int missingValues, boolean numberic)
	{
		this.mean = mean;
		this.median = median;
		this.min = min;
		this.max = max;
		this.standDeviation = standDeviation;
		this.uniqueValues = uniqueValues;
		this.missingValues = missingValues;
		this.numberic = numberic;
	}

	public DataFeature(int uniqueValues, int missingValues, boolean numberic)
	{
		this.uniqueValues = uniqueValues;
		this.missingValues = missingValues;
		this.numberic = numberic;
	}

	public long getReadDatatime() {
		return readDatatime;
	}

	public void setReadDatatime(long readDatatime) {
		this.readDatatime = readDatatime;
	}

	public long getParseDatatime() {
		return ParseDatatime;
	}

	public void setParseDatatime(long parseDatatime) {
		ParseDatatime = parseDatatime;
	}

	public long getStatisicDatatime() {
		return statisicDatatime;
	}

	public void setStatisicDatatime(long statisicDatatime) {
		this.statisicDatatime = statisicDatatime;
	}

	@Override
	public String toString() {
		return "DataFeature{" +
				"mean=" + mean +
				", median=" + median +
				", min=" + min +
				", max=" + max +
				", standDeviation=" + standDeviation +
				", uniqueValues=" + uniqueValues +
				", missingValues=" + missingValues +
				", numberic=" + numberic +
				'}';
	}

	public double getMean() {
		return mean;
	}
	public void setMean(double mean) {
		this.mean = mean;
	}
	public double getMedian() {
		return median;
	}
	public void setMedian(double median) {
		this.median = median;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getStandDeviation() {
		return standDeviation;
	}
	public void setStandDeviation(double standDeviation) {
		this.standDeviation = standDeviation;
	}
	public int getUniqueValues() {
		return uniqueValues;
	}
	public void setUniqueValues(int uniqueValues) {
		this.uniqueValues = uniqueValues;
	}
	public int getMissingValues() {
		return missingValues;
	}
	public void setMissingValues(int missingValues) {
		this.missingValues = missingValues;
	}

	public boolean isNumberic() {
		return numberic;
	}

	public void setNumberic(boolean numberic) {
		this.numberic = numberic;
	}
}
