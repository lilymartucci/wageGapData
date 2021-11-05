# UK Wage Gap Data Analysis

Enjoy!

(please disregard the GenderPayGapData2122.csv file)

## Introduction

As a young woman, the gender pay gap is particularly of interest to me because it places me and other women at a disadvantage. Additionally, as a woman
interested in finance, the industry with the greatest gender pay gap, I wanted to dive deeper and know more. Although the data is from the UK, it is a modern country that is similar to the United States. Most jobs that can be done in the US, are available to do in the UK as well. Because this data is so recent, it is very relevant to this issue.

I attempted to answer two questions. Is there a difference in the percent of female and male employees that receives a bonus ? Is there a greater percent of men or women in the top hourly pay quarter?


## Methods

This data was collected by the UK government. It is from an official government website. My project analyzed the data from 2021-2022, but other years are available to download as well. I know that I am able to use it because it is data made public by the government for citizens, and foreigners to look at. It would also be fairly twisted if the government did not make this public data because this is such a pressing and highly advocated issue.

To answer my questions I first looked at the data and picked the columns that would help me to address them. Once I saw that I really only needed four columns to get the answers that I was looking for, it became a lot easier to break the code down. As any programmer would, I pseudo-coded first. This allowed me to plan out my ideas. Then I made a method that could be implemented within my other methods. This method, organizeData, organized my data into an arrayList of an arrayList of strings. The strings were produced by the split method that split each row, or company, into its columns by commas. Once that was working, and I had my data organized and in a format that java could potentially analyze, I really got to work. For both the topMedian and genderBonus methods I had to loop through the two columns I wanted, sum the data and average it. Then I compared.

It was challenging for me at first to format my data how I wanted it. It took some asking around and research to understand that I wanted an arrayList of arrayList of strings. The more challenging part was actually that my methods had a very difficult time reading the code. For some reason the csv file contained characters that tricked the scanner into thinking that it had reached the end of the line, when in fact, there were still many more columns to look at. This shifted my data and made it inaccurate. To fix this I copied the data into a new file. Unfortunately, the issue is still not resolved, as my method is not reading my code correctly. It is giving me an outofbounds exception, when there the method is not trying to reach anything that is out of bounds.

## Results and Conclusion

The first (and only) result I obtained: In the year of 2021-2022 male average bonus (34.3215496368039%) is greater than female average bonus. This means that on average across thousands of companies in the UK, there is a 34% discrepancy in the sheer number of men that receive bonuses over women. This data has nothing to do with the actual compensation of the bonus but rather the bonus itself. This is upsetting and frankly unfair. If a man in one company is receiving a bonus, why should a woman in the same company not receiving any bonus.


I would like to answer these same questions but regarding the United States. Additionally, I would like to see if the same differences exist across different company sizes. Overall, the results do not surprise me, but it is disappointing that we are still seeing differences even in today's modern world.
