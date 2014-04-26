package edu.uncc.aside.phpcodeannotate.models;

public class ConciseWarnedCode {
	private String nodeName;
	private int lineNum;
	private String fileDir;
	
	public ConciseWarnedCode(String nodeName, int lineNum, String fileDir){
		this.nodeName = nodeName;
		this.lineNum = lineNum;
		this.fileDir = fileDir;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public String getFileDir() {
		return fileDir;
	}

	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileDir == null) ? 0 : fileDir.hashCode());
		result = prime * result + lineNum;
		result = prime * result
				+ ((nodeName == null) ? 0 : nodeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConciseWarnedCode other = (ConciseWarnedCode) obj;
		if (fileDir == null) {
			if (other.fileDir != null)
				return false;
		} else if (!fileDir.equals(other.fileDir))
			return false;
		if (lineNum != other.lineNum)
			return false;
		if (nodeName == null) {
			if (other.nodeName != null)
				return false;
		} else if (!nodeName.equals(other.nodeName))
			return false;
		return true;
	}
	

}
