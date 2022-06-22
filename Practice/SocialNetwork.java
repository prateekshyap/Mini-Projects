import java.io.*;
public class SocialNetwork
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("How many users?");
		int users=Integer.parseInt(br.readLine());
		if(users>2000&&users<1)
		{
			System.out.println("Invalid number of users!");
			System.exit(0);
		}
		else
		{
			int[][] userMatrix=new int[users][users];
			int[] mat=new int[users];

			System.out.println("Enter the data-");
			for(int i=0;i<users;i++)
				mat[i]=Integer.parseInt(br.readLine());
			for(int i=0;i<users;i++)
			{
				for(int j=0;j<users;j++)
				{
					int x=users-1;
					x=x-j;
					int d=mat[i]%10;
					mat[i]=mat[i]/10;
					userMatrix[i][x]=d;
				}
			}
			for(int i=0;i<users;i++)
			{
				for(int j=0;j<users;j++)
				{
					if(userMatrix[i][i]!=0)
					{
						System.out.println("Invalid input!");
						System.exit(0);
					}
				}
			}
			for(int i=0;i<users;i++)
			{
				for(int j=0;j<users;j++)
				{
					if(userMatrix[i][j]!=userMatrix[j][i])
					{
						System.out.println("Invalid input!");
						System.exit(0);
					}
				}
			}
			int zero=0;
			for(int i=0;i<users;i++)
			{
				for(int j=0;j<users;j++)
				{
					if(userMatrix[i][j]==0)
						zero++;
				}
			}
			zero=zero-users;
			System.out.println("Suggestions- "+zero);
		}
	}
}