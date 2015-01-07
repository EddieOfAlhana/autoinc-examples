/*
Find the line with maximum number of word count in the given file.
In case if it has multiple lines with max number of words, then it has to list all those lines.


Examples:
But since some light comes through the closed eyelids, a still greater degree 
of relaxation can be obtained, in all but a few exceptional cases, by 
excluding it. This is done by covering the closed eyes with the palms of the 
hands (the fingers being crossed upon the forehead) in such a way as to avoid 
pressure on the eyeballs. So efficacious is this practice, which I have called 
“palming,” as a means of relieving strain, that we all instinctively resort to 
it at times, and from it most patients are able to get a considerable degree 
of relaxation.

Lines with max word count:
excluding it. This is done by covering the closed eyes with the palms of the 
hands (the fingers being crossed upon the forehead) in such a way as to avoid 
it at times, and from it most patients are able to get a considerable degree


*/

	public List<String> longestLines(String fileName) throws IOException {  //LOCKED!
		int currentMaxCount = 0;
		List<String> lines = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(fileName)))) {
			String line = null;
			while ((line = br.readLine()) != null) {  //LOCKED!
				int count = (line.split("\\s+")).length;
				if (count > currentMaxCount) {
					lines.clear();
					lines.add(line);
					currentMaxCount = count;
				} else if (count == currentMaxCount) {
					lines.add(line);
				}
			}

		}
		return lines;
	}