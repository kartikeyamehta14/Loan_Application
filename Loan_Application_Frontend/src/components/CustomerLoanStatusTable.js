import React, { useState, useEffect } from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import axios from 'axios';

export default function CustomerLoanStatusTable() {
  const [applications, setApplications] = useState([]);
  const customer_id = localStorage.getItem('customer_id');

  useEffect(() => {
    // Fetch application data from the API
    axios.get('http://localhost:9091/application/'+customer_id)
      .then(response => {
        setApplications(response.data);
      })
      .catch(error => {
        console.error('Error fetching application data:', error);
      });
  }, []); // Empty dependency array ensures useEffect runs only once, like componentDidMount

  return (
    <div style={{ display: 'flex', justifyContent: 'center', alignItems: 'center', height: '100vh' }}>
      <TableContainer component={Paper} sx={{ width: '80%', maxWidth: 600 }}>
        <Table aria-label="application table">
          <TableHead>
            <TableRow>
              <TableCell>Application ID</TableCell>
              <TableCell align="right">Customer ID</TableCell>
              <TableCell align="right">Loan ID</TableCell>
              <TableCell align="right">Status</TableCell>
              <TableCell align="right">Loan Type</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {applications.map((row, index) => (
              <TableRow key={index}>
                <TableCell component="th" scope="row">
                  {row[0]}
                </TableCell>
                <TableCell align="right">{row[1]}</TableCell>
                <TableCell align="right">{row[2]}</TableCell>
                <TableCell align="right">{row[3]}</TableCell>
                <TableCell align="right">{row[4]}</TableCell>
              </TableRow>
            ))}
          </TableBody>
        </Table>
      </TableContainer>
    </div>
  );
}
